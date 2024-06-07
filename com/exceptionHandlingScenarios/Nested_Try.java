package com.exceptionHandlingScenarios;

import java.util.Scanner;

//Scenario-4: nested try-catch
public class Nested_Try {

	public static void main(String[] args) {

		// Resource leak: 'scanner' is never closed
		Scanner scanner = new Scanner(System.in);

		try {

			int values[] = { 10, 20, 30, 40, 50, 90 };

			// nested try-catch
			try {
				System.out.println("Enter any value: ");
				int value = scanner.nextInt();

				for (int i = 0; i < values.length; i++) {
					if (values[i] % value == 0) {
						System.out.println(values[i]);
					}
				}

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
