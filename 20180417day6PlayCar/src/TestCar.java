
public class TestCar {
	public static void main(String[] args) {
		System.out.println(Math.cos(0));
// 		Math.cos() ���� �޼ҵ�(static method)
//		��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		
		Car myCar = new Car("Space Blue",300);
		myCar.print();
		System.out.println(myCar.numberofcars);
		Car yourCar = new Car();
		System.out.println(yourCar.numberofcars);
//		 ���� ������ "Ŭ�󽺸�.����������"���ε� ������ �� �ִ�.
		System.out.println(Car.numberofcars);
		
//		���⼭  myCar�� �׳� ������ ����Ű�� �̸���
// 		�׳�  new Car();���� ������ public Car(){} �߰��ؾ���. ������
// 		���� �����ڸ� �������� ������ �Ű��������� �����ڸ� �ڹٿ��� �ڵ����� �������ش�
// 		������ �����ڸ� �ϳ��� �ڵ����� �����Ѵٸ� �ڹٴ� �ƹ��ϵ� ���Ѵ�.
//		myCar.setColor("Space Blue");
//		myCar.setSpeed(100);
		System.out.println(myCar); // ��� �굵 static method�� 
	}

}
