package com.greatlearning.q1.BalancedBracket.Main;

import java.util.Scanner;

import com.greatlearning.q1.BalancedBracket.Functions.CheckBalancedBracket;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String expr = sc.next();
		sc.close();

		CheckBalancedBracket bracket = new CheckBalancedBracket();
		bracket.isBracketBalanced(expr);

		if (bracket.isBracketBalanced(expr)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
}
