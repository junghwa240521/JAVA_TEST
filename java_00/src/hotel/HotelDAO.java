package hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {

	
	final int RoomCnt = 10; //객실 10개
	
	//저장소 //선언만
	List<Room> roomList;
	
//	DAO생성자
	public HotelDAO() {
		
		roomList = new ArrayList<Room>(RoomCnt);  //객체에 리스트 안에 10개의 룸 까지만 넣을 수 있다. (공간만 만듦)
		
		for(int i = 0; i<RoomCnt; i++) {
			roomList.add(new Room(false));//사용하고자 한Room의 갯수 생성
		}
	}
	
	public void checkIn(int roomNum) {
		//갹실 체크인 - List에 속해 있는 Room 객체의 사용여부를 '사용중'으로 변경
		//add- 추가/ remove -삭제 /set(인덱스 넘버, 객체)-변경
		roomList.set(roomNum-1, new Room(true));
	}
	
	
	public void checkOut(int roomNum) {
		            //roomNum-1 몇 번 인덱스에서
		roomList.set(roomNum-1, new Room(false));
	}
	
	//내가 선택한 방을 사용할 수 있는가?
	public boolean selectRoomChk(int roomNum) {
		boolean isFlag = false;
		
		isFlag = roomList.get(roomNum-1).isUsing();
		
		return isFlag;
	}
	
	public List<Room> selectRoomList() {
		
		return roomList; 
	}
}
