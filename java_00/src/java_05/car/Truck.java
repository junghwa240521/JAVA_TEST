package java_05.car;

public class Truck extends Car{

	private double weight;  //적재량

	public Truck(String model, int wheel, int sheet, String fuel, double weight) {
		super(model, wheel, sheet, fuel);
		this.weight = weight;
	}

	public Truck() {

	}

	public String carInfo() {
		String result = "";

		result += "[ 차종 ] : "+ model + "\n"; 
		result += "[ 바퀴 수 ] : "+ wheel + "\n"; 
		result += "[ 좌석 수 ] : "+ sheet + "\n"; 
		result += "[ 연료 ] : "+ fuel + "\n";
		result += "[ 적재량 ] : "+ weight + "\n";

		return result;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


}
