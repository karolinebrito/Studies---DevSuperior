package main;

import java.util.Scanner;

public class Exercises_Topic07_Aula15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of Clients: ");
		int n = sc.nextInt();
		System.out.println("");
		
		String name[] = new String[n];
		int phone[] = new int[n];
		int type[] = new int[n];
		int minutes[] = new int[n];
		
		for (int i=0; i<n; ++i) {
			System.out.println("Person #" + (i+1));
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Phone Number: ");
			phone[i] = sc.nextInt();
			System.out.print("Type: ");
			type[i] = sc.nextInt();
			System.out.print("Minutes: ");
			minutes[i] = sc.nextInt();
			System.out.println("");
		}
		
		double subscription[][] = new double[3][2];
		System.out.println("Enter the base and excess price for each account type: ");
		for (int i=0;i<3;++i) {
			System.out.println("Type " + i + ": ");
			for (int j=0;j<2;++j) {
				subscription[i][j] = sc.nextDouble();
			}
		}
		System.out.println("");
		
		double bill[] = new double[n];
		for (int i=0;i<n; ++i) {
			if (minutes[i]<=90) {
				if (type[i]==0) {
					bill[i] = subscription[0][0];
				}
				else if (type[i]==1) {
					bill[i] = subscription[1][0];
				}
				else {
					bill[i] = subscription[2][0];
				}
			}
			else {
				if (type[i]==0) {
					bill[i] = subscription[0][0] + (subscription[0][1])*(minutes[i] - 90);
				}
				else if (type[i]==1) {
					bill[i] = subscription[1][0] + (subscription[1][1])*(minutes[i] - 90);
				}
				else {
					bill[i] = subscription[2][0] + (subscription[2][1])*(minutes[i] - 90);
				}
			}
		}
		
		System.out.println("Customer Report: ");
		for (int i=0; i<n; ++i) {
			System.out.println(name[i] 
					+ ", " 
					+ phone[i] 
					+ ", Type " 
					+ type[i] 
					+ ", Bill: " 
					+ String.format("%.2f", bill[i]) 
					+ " $." );
		}		
		
		sc.close();

	}

}
