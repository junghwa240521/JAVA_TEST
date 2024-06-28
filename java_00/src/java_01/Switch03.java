package java_01; //패키지선언

import java.util.Scanner;

public class Switch03 {   //클래스 선언

	public static void main(String[] args) {   //메소드선언

		//System.out.println();메소드호출,실행문
		Scanner sc = new Scanner(System.in);

		// -----------------------------------------------------
		// Scanner를 통해 정수1 / 연산자 / 정수2 를 입력 받아 연산식을 구현하여 결과를 출력해 주세요.
		//
		// 입력 값은 총 세개
		// 
		// 정수 1 연산자 정수2 로 계산 및 결과 출력
		// -----------------------------------------------------

		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("연산자를 선택하세요. [ +, -, *, / ] : ");
		String oper = sc.next();

		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();

		System.out.printf(num1 + oper + num2, "");

		sc.close();

	}

}