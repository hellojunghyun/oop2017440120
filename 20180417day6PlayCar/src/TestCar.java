
public class TestCar {
	public static void main(String[] args) {
		System.out.println(Math.cos(0));
// 		Math.cos() 정적 메소드(static method)
//		객체를 생성하지 않고 사용할 수 있는 메소드
		
		Car myCar = new Car("Space Blue",300);
		myCar.print();
		System.out.println(myCar.numberofcars);
		Car yourCar = new Car();
		System.out.println(yourCar.numberofcars);
//		 정적 변수는 "클라스명.정적변수명"으로도 접근할 수 있다.
		System.out.println(Car.numberofcars);
		
//		여기서  myCar는 그냥 변수를 가리키는 이름임
// 		그냥  new Car();쓰면 에러남 public Car(){} 추가해야함. 이유는
// 		만약 생성자를 정의하지 않으면 매개변수없는 생성자를 자바에서 자동으로 생성해준다
// 		하지만 생성자를 하나라도 자동으로 정의한다면 자바는 아무일도 안한다.
//		myCar.setColor("Space Blue");
//		myCar.setSpeed(100);
		System.out.println(myCar); // 사실 얘도 static method임 
	}

}
