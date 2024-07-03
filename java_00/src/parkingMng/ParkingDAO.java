package parkingMng;

public class ParkingDAO {

	//확장
	static final int ROW = 4;
	static final int COL = 5;

	//데이터 저장소 //선언만 하기
	String [][] parkingSpace;
	String [][] parkingNum;



	public ParkingDAO() {
		parkingSpace = new String[ROW][COL];
		parkingNum = new String[ROW][COL];


		int patkingCnt = 0;
		for (int i = 0; i<parkingNum.length; i++) {
			for(int j = 0; j<parkingNum[i].length; j++) {
				patkingCnt++;

				parkingNum[i][j] = patkingCnt + ""; //String으로 변형
			}
		}
	}

	public void insertParking(String location, String carNum) {

		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])) {
					parkingSpace[i][j] = carNum;
				}
			}
		}
	}



	public void deleteParking(String location) {
		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])) {
					parkingSpace[i][j] = null;
				}
			}
		}
	}

	public String [][] selectParking() {
		return parkingSpace;
	}

	public String selectParkingSpace(String location) {

		String result = "";

		for(int i=0; i<parkingNum.length; i++) {
			for(int j=0; j<parkingNum[i].length; j++) {
				if(location.equals(parkingNum[i][j])) {
					result = parkingSpace[i][j];
				}
			}
		}

		return result;
	}
}
