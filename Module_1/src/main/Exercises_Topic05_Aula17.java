package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code;
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		
		System.out.print("Enter the code (1, 2 or 3). To finish, enter 4 = ");
		code = sc.nextInt();
		
		while (code!=4) {
			if (code ==1) {
				number1 +=1;
				System.out.print("Enter the code (1, 2 or 3). To finish, enter 4 = ");
				code = sc.nextInt();
			}
			else if (code==2) {
				number2 +=1;
				System.out.print("Enter the code (1, 2 or 3). To finish, enter 4 = ");
				code = sc.nextInt();
			}
			else if (code==3) {
				number3 +=1;
				System.out.print("Enter the code (1, 2 or 3). To finish, enter 4 = ");
				code = sc.nextInt();
			}
			else {
				System.out.print("Enter the code (1, 2 or 3). To finish, enter 4 = ");
				code = sc.nextInt();
			}				
			
		}
		
		System.out.println("Thank you.");
		System.out.printf("Alcohol: %d\n", number1);
		System.out.printf("Oil: %d\n", number2);
		System.out.printf("Diesel: %d\n", number3);
		
		sc.close();

	}

}
