package jih1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField; // package ��������
	
	// protect: ���� ��Ű�� �������� public
	// Ÿ ��Ű�������� private������ ����� ��.
	
	
	protected String protectedfield; 
	Animal(){
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedfield = "protected";
	}

}
