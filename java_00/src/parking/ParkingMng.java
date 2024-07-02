package parking;

import java.util.Scanner;

public class ParkingMng {


	static final int ROW = 4;
	static final int COL = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		/*
		 * [주차 관리 프로그램]
		 * 
		 * 주차장 구조
		 * 
		 * □ □ □
		 * □ □ □ 
		 * □ □ □
		 * □ □ □
		 * 
		 */

		String [][] parkingSpace = new String[ROW][COL];

		while(true) {
			System.out.println("[주차장 현황]");
			System.out.println();
			System.out.println("  1 2 3");


			for(int i = 0; i < parkingSpace.length; i++) {
				System.out.print(i+1 +" ");

				for(int j=0; j < parkingSpace[i].length; j++) {
					if(parkingSpace[i][j] == null) {
						System.out.print("ㅁ ");
					}else {
						System.out.print("■ ");						
					}

				}

				System.out.println();
			}
			System.out.println();
			System.out.println("원하는 메뉴를 선택해주세요. ");
			System.out.println("1)주차  2)출차  3)종료 ");
			String menu = sc.next();


			switch(menu) {

			case"1" :
				System.out.println("주차하고 싶은 위치를 선택해주세요.");
				System.out.print("(예시) 세로 가로 - 2 1");

				int locationRow = sc.nextInt();
				int locationCol = sc.nextInt();

				if(locationRow > ROW || locationCol > COL ) {
					System.out.println("주차 위치를 잘못 입력하셨습니다.");
					System.out.println("처음부터 다시 시작하세요.");

					break;
				}
				if(parkingSpace[locationRow-1][locationCol-1] != null) {
					System.out.println("이미 다른 사창야 주차되어 있습니다");
					System.out.println("처음부터 다시 시작하세요. ");
				}

				System.out.print("주차 차량의 번호를 입력해 주세요.(예: 20가1234) : ");
				String carNum = sc.next();

				System.out.print("차량 번호가" + carNum + " 맞습니까? (y / n)");
				String confirm = sc.next();

				if("y".equals(confirm)) {
					parkingSpace[locationRow-1][locationCol-1] = carNum;
					System.out.println(" 주차가 완료되었습니다!!");
				}else {
					System.out.println("처음부터 다시 시작하세요");
					break;
				}
				break;

			case"2" :
				System.out.println("차량 번호를 입력해 주세요. : ");
				String number = sc.next();

				int count = 0;

				for(int i = 0; i<parkingSpace.length; i++) {
					for(int j=0; j<parkingSpace[i].length; j++) {

						if(number.equals(parkingSpace[i][j])) {
							parkingSpace[i][j] = null;
							System.out.println("출차 완료!! 안녕히 가세요");
							break;
						}else {
							count++;

						}
					}
				}

				if(count == ROW * COL) {
					System.out.println("차량이 존재하지 않습니다.");
					System.out.println("차량 번호 확인 후 다시 시도해 주세요.");
				}

				break;

			case"3" :
				System.out.println("시스템 종료!!");
				System.exit(0);

				break;

			default :

			}
		}
	}

	//		arr[0][0] = "□";
	//		arr[0][1] = "□";
	//		arr[0][2] = "□";
	//		arr[1][0] = "□";
	//		arr[1][1] = "□";
	//		arr[1][2] = "□";
	//		arr[2][0] = "□";
	//		arr[2][1] = "□";
	//		arr[2][2] = "□";
	//		arr[3][0] = "□";
	//		arr[3][1] = "□";
	//		arr[3][2] = "□";
	//		
	//		for(int row=0; row < arr.length; row++) {
	//			for (int col=0; col<arr[row].length; col++) {
	//				System.out.print(arr[row][col]+ "  ");
	//			}
	//			System.out.println();
	//		}
	//		





}
