package com.anz.javatut;

import java.util.Scanner;

public class Calgetnum {
	public  void gnr() {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any 2 numbers to calculate the sum");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
}
