package main;

import java.util.Scanner;

class GlucoseMeasure{
	public static String func(double glucoseValue) {
		if (glucoseValue<=100) {
			return "NORMAL";
		}
		else if (glucoseValue> 100 && glucoseValue<=140) {
			return "HIGH";
		}
		else {
			return "DIABETES";
		}
	}
}

class TriglyceridesMeasure{
	public static String func(double triglyceridesValue) {
		if (triglyceridesValue<=200) {
			return "DESIRABLE";
		}
		else {
			return "HIGH";
		}
	}
}

class CholesterolMeasure{
	public static String func(double cholesterolValue) {
		if (cholesterolValue<=100) {
			return "DESIRABLE";
		}
		else if (cholesterolValue> 200 && cholesterolValue<=240) {
			return "THRESHOLD";
		}
		else {
			return "HIGH";
		}
	}
}

public class Exercises_Topic08_Aula20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Measure of glucose: ");
		double glucoseValue = sc.nextDouble();
		System.out.println("Classification: " + GlucoseMeasure.func(glucoseValue));
		System.out.println("");
		
		System.out.print("Measure of triglycerides: ");
		double triglyceridesValue = sc.nextDouble();
		System.out.println("Classification: " + TriglyceridesMeasure.func(triglyceridesValue));
		System.out.println("");
		
		System.out.print("Measure of cholesterol: ");
		double cholesterolValue = sc.nextDouble();
		System.out.println("Classification: " + CholesterolMeasure.func(cholesterolValue));
		System.out.println("");		
		
		sc.close();

	}

}
