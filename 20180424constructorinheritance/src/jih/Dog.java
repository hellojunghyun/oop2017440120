package jih;

public class Dog extends Animal {
	public Dog() { //디폴트 생성자
		//명시적 수퍼클라스의 생성자 호출 super();
		System.out.println("Dog default 생성자");
	} 
	public Dog(int a) {
		super(3);
		System.out.println("Dog 정수형 생성자");
	} 

}
//생성자도 상속을 받는다
//subclass 4-5개 만들지 마라 복잡해진다