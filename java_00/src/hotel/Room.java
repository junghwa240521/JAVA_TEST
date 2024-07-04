package hotel;

public class Room {
	
	private boolean isUsing;
	//true : 사용중
	//false : 사용가능(빈 객실)
	
	public Room() {
		
	}
	
	public Room(boolean isUsing) {
		this.isUsing = isUsing;
	}

	//get으로 표기x
	public boolean isUsing() {
		return isUsing;
	}

	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}
	
	
}
