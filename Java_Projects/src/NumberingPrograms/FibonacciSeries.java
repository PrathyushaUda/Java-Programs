package NumberingPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a + " " + b);
		for (int i = 2; i <= n; i++) {
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}

	}

}
