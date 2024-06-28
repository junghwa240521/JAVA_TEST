package calc;

import java.util.Scanner;

public class CalcSumEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		int nums = 0;
		
		int result = 0;
		
		System.out.println("숫자를 입력해주세요.");
		num = sc.nextInt();
		nums = sc.nextInt();
		
		
		result= sum(num);
		System.out.println("결과" + result);
		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 합계를 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */
	}
	public static int sum (int num) {
		int result = 0;
		
		for(int i=0; i<num; i++) {
			result=i;
		}
		
		return result;
	}
}