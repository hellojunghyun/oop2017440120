package jih2;
import jih1.*;

public class Test {
	public static void main(String[] args) {
		Basil aBasil = new Basil ();
		aBasil.name = "Lily";
		//aBasil.age = 2; age is a private field
		
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//jih1.Dog aDog = new jih1.Dog();
		//2. import ��ɾ ���
		//import jih1.*;
		jih1.Dog aDog = new jih1.Dog(); // jih1. ���̸�
		aDog.name = "happy";
		//error aDog.IDN = "22332";
		//error aDog.nickname = "haaaaaaappy"; nickname�� ��Ű�� ���� ����
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		
		
		
	}

}
