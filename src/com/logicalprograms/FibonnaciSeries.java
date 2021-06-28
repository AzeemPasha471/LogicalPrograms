package com.logicalprograms;

import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int count, a = 0, b = 0, c = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter value of n:");
			count = sc.nextInt();
			System.out.print("Fibonacci Series:");
			for (int i = 1; i <= count; i++) {
				a = b;
				b = c;
				c = a + b;
				System.out.print(a + " ");
			}
		}
	}
}
