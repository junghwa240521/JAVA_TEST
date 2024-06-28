package java_01;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
		
		
		
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		
		for(int dan=1; dan <=9; dan++) {	
			for (int i =1; i<10; i++) {
				if (dan * i == dan*i ) {
					
				}
				System.out.println(dan + "*" + i + "=" + dan*i);
				dan++;
			}
		}
		
		
		

		
	}

}