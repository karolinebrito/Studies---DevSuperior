package main;

import java.util.Scanner;

class MultiplicationTable{
	public static void func(int n) {
		for (int i=1; i<11;++i) {
			int product = n*i;
			String str = n + " x " + i + " = " + product + "\n";
			System.out.println(str);
		}
	}	
}

public class Exercises_Topic08_Aula19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do you want the multiplication table of each number? ");
		int n = sc.nextInt();
		
		MultiplicationTable.func(n);
		sc.close();

	}

}
