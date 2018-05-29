package jih1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickname; //package 접근지정: 패키지 내에서만 public 처럼 사용
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedfield);
		
	}
}
