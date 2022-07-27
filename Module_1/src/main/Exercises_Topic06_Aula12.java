package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Exercises_Topic06_Aula12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int n = sc.nextInt();
		
		double vec[] = new double[n];
		
		for (int i=0; i<n; ++i) {
			System.out.print("Enter a number: ");
			vec[i] = sc.nextDouble();
		}
		
		double tempVec[] = Arrays.copyOf(vec, n);
		Arrays.sort(tempVec);
		double value = tempVec[n-1];
		System.out.printf("Highest value %.2f", tempVec[n-1]);
		System.out.println("");
		
		List<Double> list = DoubleStream.of(vec).boxed().collect(Collectors.toList());
		int index = list.indexOf(value);
		System.out.print("Index of the highest value: " + index);
		
		sc.close();

	}

}
