package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises_Topic05_Aula12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[2];		
		
		System.out.println("Enter 2 integer numbers: ");
		for (int i=0; i<2; i++) {
			n[i] = sc.nextInt();
		}
		
		Arrays.sort(n);
		
		int sum = 0;
		
		for (int i=(n[0]+1); i<=(n[1]-1); ++i){
			if (i%2!=0) {
				System.out.println(i);
				sum += i; 				
			}
			else {
				
			}
		}
		
		System.out.printf("SUM = %d", sum);
				
		sc.close();
		
	}

}
