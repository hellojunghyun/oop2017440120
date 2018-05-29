package jih2;
import jih1.*;

public class Test {
	public static void main(String[] args) {
		Basil aBasil = new Basil ();
		aBasil.name = "Lily";
		//aBasil.age = 2; age is a private field
		
		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//jih1.Dog aDog = new jih1.Dog();
		//2. import 명령어를 사용
		//import jih1.*;
		jih1.Dog aDog = new jih1.Dog(); // jih1. 붙이면
		aDog.name = "happy";
		//error aDog.IDN = "22332";
		//error aDog.nickname = "haaaaaaappy"; nickname은 패키지 접근 지정
		Animal aa = new Animal();
		//aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		
		
		
	}

}
