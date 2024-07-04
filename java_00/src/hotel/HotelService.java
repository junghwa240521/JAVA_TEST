package hotel;

import java.util.List;
import java.util.Scanner;

public class HotelService {

	//입실,퇴실,종료  //객체    //객체를 담고 있는 변수
	public static HotelDAO hotelDAO;
	public static Scanner sc = new Scanner(System.in);

	public HotelService() {
		hotelDAO = new HotelDAO();
	}

	public void startProgram() {

		while(true){
			
			int choice = printMenu();
			
			switch(choice) {
			case 1 :
				//입실
				checkIn();
				break;
			case 2 :
				//퇴실
				checkOut();
				break;
			case 3 :
				//방보기
				roomInfo();//메소드
				break;
			case 4 :
				//프로그램 종료
				System.out.println("프로그램 종료!!");
				System.exit(0);
				break;

			default :
				System.out.println("1~4까지 입력해주세요!!");
				break;
			}
		}
	}
	
	public int printMenu() {
		System.out.println("====호텔 관리 프로그램====");
		System.out.println(" [호텔에는 총 " + hotelDAO.RoomCnt /*" 객실 갯수 표시 "*/ + " 개의 객실이 있습니다. ]");
		System.out.println("-----------------------------------------------------");
		System.out.println("1. 입실   2. 퇴실   3. 방보기   4. 종료");
		System.out.println("선택: ");
		

		int choice = sc.nextInt();

		// ====호텔 관리 프로그램====
		//[ 호텔에는 총 0000개의 객실이 있습니다. ]
		//---------------------------------
		//1. 입실   2. 퇴실   3. 방보기   4. 종료
		//선택:
		//메뉴 입력을 받아주세요.


		return choice;

	}

	public void checkIn() {
		System.out.println("몇 번 방에 입실 하시겠습니까?");
		int roomNum = sc.nextInt();
		//[ 체크1 ] 1~RoomCnt 사이의 객실 번호를 입력하였는지
		//[ 체크2 ] 선택한 객실에 손님이 있는지
		//체크 1,2가 아니어야 정상적으로 입실 가능

		if(roomNum < 1 || roomNum > hotelDAO.RoomCnt) {
			System.out.println("호텔에는 1 ~ " + hotelDAO.RoomCnt + "호텔 까지의 객실이 있습니다.");
			System.out.println("다시 선택해 주세요.");
		}else if(hotelDAO.selectRoomChk(roomNum)) {
			System.out.println("해당 객실은 이미 손님이 계십니다. 다른 객실을 선택해 주세요.");
		}else {
			//객실 체크인
			hotelDAO.checkIn(roomNum);
			System.out.println("객실 체크인이 완료 되었습니다. 즐거운 하루 되세요!!");
		}

	}
	
	public void checkOut() {
		System.out.println("몇 번 객실에서 퇴실하시겠습니까?");
		int roomNum = sc.nextInt();
		
		hotelDAO.checkIn(roomNum);
		
		
	}
	
	public void roomInfo() {
		//roomList 받아오기
		List<Room> rooms = hotelDAO.selectRoomList();
		
		//roomList에서 Room 객체의 사용여부를 확인할 수 있도록 반복문 구형
		//Room 객체의 사용 여부는 isUsing으로 알 수 있다
		//isUsing = true 이면, 사용중
		//isUsing = false 이면, 사용 가능(빈 방)
		
		
		int cnt = 1;
		
		//향상된 for
		for(Room r : rooms) {
			if(r.isUsing()==true) {
				System.out.println(cnt + "호 객실은 현재 손님이 있습니다.");
			}else {
				System.out.println(cnt + "호 객실은 현재 비어 있습니다.");
			}
			cnt++;
		}

		//[ 최종 결과 - 총 RoomCnt 만큼의 객실 상태를 보여주면 됨 ]
		//1호 객실은 현재 손님이 있습니다.
		//2호 객실은 현재 비어 있습니다.
		//3 .........
		//10호 객실은 현재 비어 있습니다.
		
		
	}
	
	

}
