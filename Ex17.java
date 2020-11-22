package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num;
		
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("");
			for (int j=i; j<=num-1;j++) {
			System.out.println("*");
			
			}
		sc.close();
		}
	}
}


