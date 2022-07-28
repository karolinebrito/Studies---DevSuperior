package main;

import java.util.Scanner;

public class Exercises_Topic06_Aula19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products? ");
		int n = sc.nextInt();
		System.out.println("");
		
		double purchasePrice[] = new double[n];
		double salePrice[] = new double[n];
		String name[] = new String[n];
		double profit[] = new double[n];
		
		for (int i=0;i<n;++i) {
			System.out.println("Product #" + (i+1) + ": ");
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Purchase price: ");
			purchasePrice[i] = sc.nextDouble();
			System.out.print("Sale price: ");
			salePrice[i] = sc.nextDouble();
			System.out.println("");
		}
		
		double totalProfit = 0;
		double totalPurchaseAmount = 0;
		double totalSalesValue = 0;
		double percentualProfit[] = new double[n];
		int lower10 = 0;
		int between10And20 = 0;
		int above20 = 0;
		for (int i=0;i<n;++i) {
			profit[i] = salePrice[i]-purchasePrice[i];
			percentualProfit[i] = (profit[i]/purchasePrice[i])*100;
			if (percentualProfit[i]<10) {
				lower10 += 1;
			}
			else if (percentualProfit[i]>=10 && percentualProfit[i]<20) {
				between10And20 += 1;
			}
			else {
				above20 += 1;
			}
			totalProfit += profit[i];
			totalPurchaseAmount += purchasePrice[i];
			totalSalesValue += salePrice[i];
		}
		
		System.out.println("Profit below 10%: " + lower10);
		System.out.println("Profit between 10% and 20%: " + between10And20);
		System.out.println("Profit above 20%: " + above20);
		System.out.println("Total Purchase Amount: " + String.format("%.2f", totalPurchaseAmount));
		System.out.println("Total Sales Value: " + String.format("%.2f", totalSalesValue));
		System.out.println("Total Profit: " + String.format("%.2f", totalProfit));
		
		sc.close();

	}

}
