package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int i;
		int num;
		int count;
		int sum=0;
		
		num = sc.nextInt();
		
		count= num/5;
		System.out.println("5의 배수의 개수:" + count);
		
		for (i=1;i<=count;i++) {
			sum = sum + 5*i;
			System.out.println(i+", "+ sum);
		}
		System.out.println("5의 배수의 합:" + sum);
		sc.close();	
	
	
}
		

	}
	 

		
		

	
	

