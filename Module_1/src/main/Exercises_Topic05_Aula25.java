package main;

import java.util.Scanner;

public class Exercises_Topic05_Aula25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many tests: ");
		int n = sc.nextInt();
		
		int totalAmount = 0;
		int amountOfB = 0;		
		int amountOfR = 0;
		int amountOfF = 0;		
		
		for (int i=1; i<=n; ++i) {
			
			System.out.print("Amount of guinea pigs: ");
			int partialAmount = sc.nextInt();
			
			totalAmount += partialAmount;
			
			System.out.print("Type of guinea pig (B/R/F): ");
			String type = sc.next();
			sc.nextLine();
			
			if (type.equals("B")) {
				amountOfB += partialAmount;
			}
			else if (type.equals("R")) {
				amountOfR += partialAmount;
			}
			else {
				amountOfF += partialAmount;
			}
		}
		
		System.out.println("");
		System.out.println("Final Report.");
		System.out.printf("Total of guinea pigs: %d \n", totalAmount);
		System.out.printf("Total of bunny: %d \n", amountOfB);
		System.out.printf("Total of rats: %d \n", amountOfR);
		System.out.printf("Total of frogs: %d \n", amountOfF);		
		System.out.println("");
		
		double resB = ((amountOfB*1.0)/(totalAmount*1.0))*100;
		double resR = ((amountOfR*1.0)/(totalAmount*1.0))*100;
		double resF = ((amountOfF*1.0)/(totalAmount*1.0))*100;
		
		System.out.printf("Percentual of bunny: %.2f \n", resB);
		System.out.printf("Percentual of rats: %.2f \n", resR);
		System.out.printf("Percentual of frogs: %.2f \n", resF);

		
		sc.close();

	}

}
