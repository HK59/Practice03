package com.javaex.practice.copy;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		Scanner sc =new Scanner(System.in); 
		int num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			for (int x = 0; x <i; x++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
