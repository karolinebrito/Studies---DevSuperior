package main;

import java.util.Scanner;

public class Exercises_Topic03_Aula21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Time in seconds: ");
		int timeSeconds = sc.nextInt();
		
		if (timeSeconds < 60) {
			System.out.print("0:0:%d" + timeSeconds);
		}
		
		else if (timeSeconds >= 60  && timeSeconds < 3600) {
			System.out.print("0:" + String.format("%d",timeSeconds/60) + ":" + String.format("%d",timeSeconds%60));
		}
		
		else {
			System.out.print(String.format("%d",timeSeconds/3600) + ":" + String.format("%d",(timeSeconds%3600)/60) + ":" + String.format("%d",((timeSeconds%60)%60)%60));
		}
		
		sc.close();

	}

}
