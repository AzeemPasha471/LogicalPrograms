package reversenumber;

import java.util.Scanner;

public class ReverseNmuber {
	public static void main(String args[]) {
		int n, reverse = 0;
		System.out.println("Enter an integer to reverse");
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			while (n != 0) {
				reverse = reverse * 10;
				reverse = reverse + n % 10;
				n = n / 10;
			}

			System.out.println("Reverse of the number is " + reverse);
		}
	}
}
