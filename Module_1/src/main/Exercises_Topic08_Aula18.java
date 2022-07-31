package main;

import java.util.Scanner;

class ClassifyGlucose{
	public static String func(double glucoseValue) {
		if (glucoseValue<=100) {
			return "Normal";
		}
		else if (glucoseValue>100 && glucoseValue<=140) {
			return "High";
		}
		else {
			return "Diabetes";
		}
	}
}

public class Exercises_Topic08_Aula18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of glucose: ");
		double glucoseValue = sc.nextDouble();
		
		System.out.println("Classification: " + ClassifyGlucose.func(glucoseValue));
		
		sc.close();

	}

}
