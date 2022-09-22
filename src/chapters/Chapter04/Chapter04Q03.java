package Chapter04;

import java.util.Scanner;

public class Chapter04Q03 {
	public static void main(String[] args) {
		/*
		 * (x1, y1) and (x2, y2) be the geographical latitude and longitude of two
		 * points.
		 */
		Scanner keyboard = new Scanner(System.in);
		// We will use the following formula
		// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

		final double radius = 6371.01;
		
		double distanceAtlToOrl;
		double distanceOrlToSav;
		double distanceSavToCha;
		double distanceChaToAtl;
		double distanceChaToOrl;

		double radianXAtl = Math.toRadians(-84.3880);
		double radianYAtl = Math.toRadians(33.7490);
		double radianXOrl = Math.toRadians(-81.3789);
		double radianYOrl = Math.toRadians(28.5384);
		double radianXSav = Math.toRadians(-81.0912);
		double radianYSav = Math.toRadians(32.0809);
		double radianXCha = Math.toRadians(-80.8431);
		double radianYCha = Math.toRadians(35.2271);

		distanceAtlToOrl = radius * (Math.acos((Math.sin(radianXAtl) * Math.sin(radianXOrl))
				+ (Math.cos(radianXAtl) * Math.cos(radianXOrl) * Math.cos(radianYAtl - radianYOrl))));
		System.out.printf( "%1s %4.2f%3s","The distance between Atlanta and Orlando is  :", distanceAtlToOrl, "miles" );
		
		distanceOrlToSav = radius * (Math.acos((Math.sin(radianXOrl) * Math.sin(radianXSav))
				+ (Math.cos(radianXOrl) * Math.cos(radianXSav) * Math.cos(radianYOrl - radianYSav))));
		System.out.printf( "\n%1s%4.2f %3s\n","The distance between Orlando and Savannah is  : ", distanceOrlToSav, "miles" );
		
		distanceSavToCha = radius * (Math.acos((Math.sin(radianXSav) * Math.sin(radianXCha))
				+ (Math.cos(radianXSav) * Math.cos(radianXCha) * Math.cos(radianYSav - radianYCha))));
		System.out.printf( "%1s%4.2f %3s","The distance between Savannah and Charlotte is  : ", distanceSavToCha, "miles" );
		
		distanceChaToAtl = radius * (Math.acos((Math.sin(radianXCha) * Math.sin(radianXAtl))
				+ (Math.cos(radianXCha) * Math.cos(radianXAtl) * Math.cos(radianYCha - radianYAtl))));
		System.out.printf( "\n%1s%4.2f %3s\n","The distance between Charlotte and Atlanta is  : ", distanceChaToAtl, "miles" );
		
		distanceChaToOrl = radius * (Math.acos((Math.sin(radianXCha) * Math.sin(radianXOrl))
				+ (Math.cos(radianXCha) * Math.cos(radianXOrl) * Math.cos(radianYCha - radianYOrl))));
		System.out.printf( "%1s%4.2f %3s\n","The distance between Charlotte and Orlando is  :", distanceChaToOrl, "miles" );
		
		// Lets find out s which is equal to =>> s = (side1 + side2 + side3) /2

				double s1 = (distanceChaToAtl + distanceAtlToOrl + distanceChaToOrl) / 2;
				double Area1 = Math.pow(s1 *(s1 - distanceChaToAtl) * (s1 - distanceAtlToOrl) * (s1 - distanceChaToOrl), 0.5);
				
				double s2 = (distanceOrlToSav + distanceSavToCha + distanceChaToOrl) / 2;
				double Area2 = Math.pow(s2 *(s2 - distanceOrlToSav) * (s2 - distanceSavToCha) * (s2 - distanceChaToOrl), 0.5);
				
				System.out.printf("\n%s %3.2f %2s\n ",
				"The area of the polygon within the boundaires of these 4 cities  is" ,(Area1 + Area2) , " miles");
 
	}

}
