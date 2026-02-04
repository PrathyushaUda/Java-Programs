package NumberingPrograms;

import java.util.Scanner;

public class Factors {
	static void Fact(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eenter a number:");
		int n1 = sc.nextInt();
		Fact(n1);

	}

}
