package com.gradeproject.q2;

import java.util.Scanner;

public class XPowerOfN {
	public static int power(int a, int b) {
		if (b == 0) {
			return 1;
		} else {
			return power(a, b - 1) * a;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base number X : ");
		int X = sc.nextInt();
		System.out.print("enter the power number N = ");
		int N = sc.nextInt();
		System.out.println("X power N is : " + power(X, N));

	}

}
