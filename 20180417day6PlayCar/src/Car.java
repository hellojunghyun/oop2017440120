
public class Car {
	
	//Fields
	private String color;
	private int speed;
	
	public static int numberofcars = 0; //�������� (static field)
	
	//Constructor (������) : �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
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
		// �����޼ҵ��  ��ü�� �ʿ������ ���������� ������ �� �ִ�.
//		System.out.println(this.color + ", " + this.speed); error ��ü����!
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
