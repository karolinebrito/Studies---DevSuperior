package main;

public class Example_Topic03_Pag29 {

	public static void main(String[] args) {
		
		String product1, product2, gender;
		Double price1, price2;
		int age, code;
		
		product1 = "Computador";
		product2 = "TV";
		price1 = 2100.5;
		price2 = 1830.0;
		age = 30;
		code = 5291;
		gender = "F";
		
		System.out.printf("The product %s costs R$ %.2f\n", product1, price1);
		System.out.printf("The product %s costs R$ %.2f\n", product2, price2);
		System.out.println("");
		System.out.println("Code = " + code);
		System.out.println("");
		System.out.println("Personal Data: gender " + gender + " and age " + age);
		
	}

}

