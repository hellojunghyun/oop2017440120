package jih1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tina = new Dog();
		tina.name = "tina";
		// tina.IDN = "30942394"; Error IDN is a private field
		tina.nickname = "haaaaaaappy";
		tina.publicField = "U2";
		// tina.privateField = "Sting";
		tina.packageField = "Ed";
		tina.protectedfield = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedfield = "ddd";

	}

}
