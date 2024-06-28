package java_01;

import java.util.Scanner;

public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로

		int forTotal = 0;

		for (int i=1; i<=10; i++) {
			forTotal = forTotal + i;
			// total += i;

//			 System.out.println(i + " :: " + forTotal);
		}

		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

		int w = 1;
		int whileTotal = 0;

		while (w <= 100) {
			whileTotal = whileTotal + w;
			// whileTotal += w;			
			w++;

			// System.out.println(w + " :: " + whileTotal);
		}

		System.out.println("while total ==== " + whileTotal);
		System.out.println();
		
		
		// (for) 1~100까지의 정수 중 6의 배수 출력
		
		for (int i=0; i<=100; i++) {
			if(i % 6 == 0) {
				System.out.println(i);
			}
		}
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
		
		int a = 1;
		
		while (a <=100) {
			if(a % 6 == 0) {
				System.out.println("while"+"\n"+ a);
				System.out.println("----------------------------------------");
			}
			a++;
//			System.out.println("while"+"\n"+ a);

		}
		
		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		
		for(int s = 1; s<=200; s++) {
			if(s%6==0 && s % 12 != 0 ) {
				System.out.println("1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력" + s );
				System.out.println("==================================================" );
			}
			
		}
		
		
		
		
		
		
		
		
		for(int r = 1; r <= 200; r++) {
			if(r %6==0&& r%12!=0) {
				System.out.println("for \n" + r);
			}
		}
		
		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		
		int e = 1;
		while (e<=200) {
			if(e % 6 == 0 && e % 12 != 0 ) {
				System.out.println("while \n"+ e );
			}
			e++;
		}
		
		
		
		
		//(for) 1~60000까지의 정수 중 100의 배수는 몇개일까요?
		int cnt = 0;
		
		for(int z = 1; z <= 60000; z++ ) {
			if(z % 100 == 0) {
				cnt++;
			}
		}
		System.out.println("*for* 1~60000까지의 정수중 100의 배수 \n" + cnt + "입니다");
		
		
		//(while) 1~60000까지의 정수 중 100의 배수는 몇개일까요?
		
		int c = 1;
		int cCnt = 0;

		
		while(c<=60000) {
			if(c%100==0) {
				cCnt++;
				
			}
			c++;
		}
		System.out.println("while \n" + cCnt );
	}

}