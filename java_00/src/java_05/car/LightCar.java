package java_05.car;

public class LightCar extends Car{
	
	private double discountOffer;  //경차 할인율
	
	public LightCar() {
		
	}
	
	public LightCar(String model, int wheel, int sheet, String fuel, double arg5) {
		super(model, wheel, sheet, fuel);
		this.discountOffer = arg5;
	}
	
	public String carInfo() {
		String result = "";
		
		result += "[ 차종 ] : "+ model + "\n"; 
		result += "[ 바퀴 수 ] : "+ wheel + "\n"; 
		result += "[ 좌석 수 ] : "+ sheet + "\n"; 
		result += "[ 연료 ] : "+ fuel + "\n";
		result += "[ 적재량 ] : "+ discountOffer + "\n";
		
		return result;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	
}
