package jih1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField; // package 접근지정
	
	// protect: 동일 패키지 내에서는 public
	// 타 패키지에서는 private이지만 상속은 됨.
	
	
	protected String protectedfield; 
	Animal(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedfield = "protected";
	}

}
