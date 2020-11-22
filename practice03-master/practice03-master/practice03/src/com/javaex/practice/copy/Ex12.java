package com.javaex.practice.copy;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, result=0;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			result += i;
			System.out.print(i);
			
			if(i==num) {
				System.out.println("");
			}else {
				System.out.print("+");
			}
		}
		
		System.out.println("합계 : " +result);
		sc.close();
	}

}
