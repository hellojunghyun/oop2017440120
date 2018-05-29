
public class Car {
	
	//Fields
	private String color;
	private int speed;
	
	public static int numberofcars = 0; //정적변수 (static field)
	
	//Constructor (생성자) : 메소드명이 클라스 이름과 같다. 반환형이 없다.
	public Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		numberofcars++;
	}

	public Car(){
		this.color = "White";
		this.speed = 60;
		numberofcars++;
	}
	
	//methods
	public static void print() {
		// 정적메소드는  객체도 필요없으니 정적변수만 접근할 수 있다.
//		System.out.println(this.color + ", " + this.speed); error 객체못씀!
		System.out.println(numberofcars);
	} 
	
	public String toString() {
		return ("Color is "+ this.color + ", Speed is " + this.speed);
	}
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	

}
