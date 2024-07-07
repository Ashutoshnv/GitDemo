package com.demo;

import java.util.Scanner;

public class Addition {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Addition.add(a, b);
		System.out.println(String.format("The sum of a=%d and b = %d id c=%d", a,b,c));
	}
}
