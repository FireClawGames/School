package com.hackerrank.java.introduction;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; scanner.hasNextLine(); i++) {
			System.out.printf("%d %s%n", i, scanner.nextLine());
		}

		scanner.close();
	}
}