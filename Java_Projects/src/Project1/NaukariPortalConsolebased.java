package Project1;

import java.util.Scanner;

public class NaukariPortalConsolebased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Naukari- Job Application Requirement process");
		System.out.println("Enter your full name:");
		String name = sc.nextLine();

		System.out.println("Enter your mail id:");
		String mailid = sc.next();

		System.out.println("Enter your mobile number:");
		long number = sc.nextLong();

		System.out.println("	If you have any PG Qualification (optional):");
		String qualif = sc.next();

		System.out.println("If yes, Enter your branch:");
		String branch = sc.next();

		System.out.println("Enter your Specialaization:");
		String Specialaization = sc.next();

		System.out.println("Enter your PG percentage:");
		double pgpercentage = sc.nextDouble();

		if (pgpercentage >= 75) {
			System.out.println("go to next");
			System.out.println("PG year of passing:");
			int years = sc.nextInt();
			if (years >= 2022 || years <= 2025) {
				System.out.println("go to next step");

				System.out.println("Enter your UG Qualification:");
				String ug = sc.next();

				System.out.println("Enter your branch1:");
				String branch1 = sc.next();

				System.out.println("Enter your UG percentage");
				double ugpercentage = sc.nextDouble();

				if (ugpercentage >= 70) {
					System.out.println("go next step");
					System.out.println("UG year of passing:");
					int year = sc.nextInt();

					if (year >= 2020 || year <= 2025) {
						System.out.println("go to next step");

						System.out.println("Do you have any experience:");
						String exp = sc.next();

						System.out.println("If yes, mentioned how many years of experience: ");
						int exp1 = sc.nextInt();

						if (exp1 <= 3) {
							System.out.println("you are eligible go next step");

							System.out.println("Expected salary per annum:");
							double salary = sc.nextDouble();
							if (salary > 3.5 & salary < 12.5) {
								System.out.println("go to next step");
								System.out.println("Mentioned your technical skills:");
								String skills = sc.next();

								System.out.println("Do you have any academic/career gap:");
								String gap = sc.next();

								System.out.println("If Yes, Please specify the duration of your  academic/career gap:");
								int carrergap = sc.nextInt();

								System.out.println("Have you completed any certifications :");
								String cert = sc.next();

								System.out.println("Do you have any Experience in internship:");
								String expi = sc.next();

								System.out.println("Upload your updated Resume");
								System.out.println("your profile matching our requirement");

							} else {
								System.out.println(" not eligible to this process");

							}

						} else {
							System.out.println("your percentage does not matching our requirement");
						}

					} else {
						System.out.println("does not match , not eligible");
					}
				} else {
					System.out.println(" year of passing does not match our crateria");
				}
			} else {
				System.out.println(" year of passing does not match our crateria");
			}

		} else {
			System.out.println("Not eligible for this position");
			System.out.println("not shortlisted");

			sc.close();
		}

	}

}
