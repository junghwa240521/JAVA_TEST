package java_01;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력
		// 
		// [ 출력 결과 예시 ] 6월의 마지막 날짜는 30일 입니다.
		// -----------------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Scanner를 통해 1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자를 출력");
		int month = sc.nextInt();
		
		
		
//		switch(month) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println(month + "월은 31일까지 있습니다.");
//			break;
//		case 2:
//			System.out.println(month + "월은 29일까지 있습니다.");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println(month + "월은 29일까지 있습니다.");
//			break;
//		default :
//			System.out.println("달(월)은 1월~12월 까지만 있어요!!");
//		}
//		
		
		// 동일한 조건식을 if문으로 작성해보기

		
		if (month ==1 || month == 3 || month==5 ||month == 7 || month == 8 || month==10 || month==12) {
			System.out.println(month+"월은 31일까지 입니다");	
		}else if(month==2){
			System.out.println(month+"월은 29일까지 입니다");
		}else if(month==4 || month == 6 || month==9 ||month == 11 ){
			System.out.println(month+"월은 30일까지 입니다");
		}else {
			System.out.println("달(월)은 1워~12월 까지만 있어요 !!");
		}
	}
}
	

