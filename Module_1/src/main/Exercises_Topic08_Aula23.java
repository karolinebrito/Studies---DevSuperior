package main;

import java.util.Scanner;

class fun{
	public static double SalaryTax(double annualSalary) {
		if ((annualSalary/12)<=3000) {
			return 0;
		}
		else if ((annualSalary/12)>3000 && (annualSalary/12)<=5000) {
			return annualSalary*0.1;
		}
		else {
			return annualSalary*0.2;			
		}
	}
	
	public static double ServiceProvisionTax(double annualServiceProvision) {
		return annualServiceProvision*0.15;
	}
	
	public static double CapitalGainTax(double annualCapitalGain) {
		return annualCapitalGain*0.20;
	}
	
	public static double grossTax(double annualSalary, double annualServiceProvision, double annualCapitalGain) {
		return SalaryTax(annualSalary) + ServiceProvisionTax(annualServiceProvision) + CapitalGainTax(annualCapitalGain);
	}
	
	public static double maximumDeductible(double annualSalary, double annualServiceProvision, double annualCapitalGain) {
		return (SalaryTax(annualSalary) + ServiceProvisionTax(annualServiceProvision) + CapitalGainTax(annualCapitalGain))*0.3;
	}
	
	public static double deductibleExpenses(double medicalExpenses, double educationalExpenses,double annualSalary, double annualServiceProvision, double annualCapitalGain) {
		double deductible = medicalExpenses + educationalExpenses;
		if (deductible>(maximumDeductible(annualSalary, annualServiceProvision, annualCapitalGain))) {
			return deductible = maximumDeductible(annualSalary, annualServiceProvision, annualCapitalGain);
		}
		else {
			return deductible;
		}	
	}
	
}

public class Exercises_Topic08_Aula23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter taxpayer data: ");
		
		System.out.print("Annual income with salary: ");
		double annualSalary = sc.nextDouble();
		
		System.out.print("Annual income with service provision: ");
		double annualServiceProvision = sc.nextDouble();
		
		System.out.print("Annual income with capital gain: ");
		double annualCapitalGain = sc.nextDouble();
		
		System.out.print("Medical expenses: ");
		double medicalExpenses = sc.nextDouble();
		
		System.out.print("Educational expenses: ");
		double educationalExpenses = sc.nextDouble();
		
		System.out.println();
		System.out.println("Resume: ");
		
		System.out.printf("Salary tax = %.2f\n", fun.SalaryTax(annualSalary));
		System.out.printf("Service tax  = %.2f\n", fun.ServiceProvisionTax(annualServiceProvision));
		System.out.printf("Capital gain tax:  = %.2f\n", fun.CapitalGainTax(annualCapitalGain));
		System.out.printf("Total Gross Tax = %.2f\n", fun.grossTax(annualSalary, annualServiceProvision, annualCapitalGain));
		System.out.printf("Abatement = %.2f\n", fun.deductibleExpenses(medicalExpenses, educationalExpenses, annualSalary, annualServiceProvision, annualCapitalGain));
		System.out.printf("Tax due = %.2f\n", fun.grossTax(annualSalary, annualServiceProvision, annualCapitalGain)-fun.deductibleExpenses(medicalExpenses, educationalExpenses, annualSalary, annualServiceProvision, annualCapitalGain));
		
		
		sc.close();

	}

}
