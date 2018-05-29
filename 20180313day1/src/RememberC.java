
public class RememberC {

	public static void main(String[] args) {
		//변수 : 메모리 저장공간의 이름
		
		//자료형 : 
		//1.변수가 가질 수 있는 값의 범위를 정한다.
		//2.변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
		//3.값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다.
		
		// 변수 선언문
		//사용할 변수의 이름을 지정한다
		//사용할 변수의 자료형을 선언한다.
		//JAVA에서 변수를 사용하기 전에  반드시 변수선언을 해야 한다.
		
		int a,b; 
		// 변수 선언문 1. a는 변수의 이름이다. 2. 변수 a의 자료형은 int이다.
		
		
		a = 10;
		
		//리터럴(literal) 소스코드에서 값을 표현하는 방법
		// 10 = a; 좌변엔 리터럴이기에 저장을 못함

		//연산자 : 연산을 위한 기호
		
		//대입연산자(=): 우변의 값을 좌변의 저장소로 이동한다. 우변의 값을 반환한다.
		
		//수식(Expression) : 연산자와 피연산자(리터럴, 변수, 수식)들의 조합. 
		// 모든 수식은 값을 반환(리턴)한다.
		
		// 부수효과 (side effect) : 수식이 값을 반환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
				
		a = 0x10;
		a = a * 10 + 20;
		
		// post increment(a++) : 반환값은 a, 부수효과는 a = a+1;
		b = a++;
		System.out.println("a = " + a + "b =" + b);
		// pre increment(++a) : 반환값은 a+1, 부수효과는 a = a+1;
		a = 10;
		b = ++a;
		

		System.out.println("a = " + a + "b =" + b); //("a = " + a); 문자열/ 연산자-> 쭉 가다가 거기다가 a라는 변수를 추가해라 / 변수
		
		System.out.println("Hellllllo " + "there" ); //string 2개 붙이기 -> concatinate 
		
		System.out.println("Hello World");
		
		System.out.print("Hello World");
		
		//JAVA는 부울 자료형과 true/false 리터럴을 사용한다.
		// 논리연산자(&&,||,!)의 피연산자는 부울 변수 또는 리터럴을 사용해야한다.
		// 관계연산자(>,<,<=,==,!=)는 부울 값을 반환한다.
		
		boolean bb;
		bb = true || false ;
		bb = 0>1;
		System.out.println("bb = " + bb );
		
		//JAVA에서 상수를 선언하려면 final 키워드를 사용해야한다. 
		
		final int c = 100;
		
		// c = 1000; 불가능 | error c는 상수
		
		
		System.out.println("c= " + c);
	
		/* c언어에서 pointer가 타 언어에서는 reference
		 * _로 변수 시작하는거 하지마 합법이긴한데 다른데서 많이쓰니까 같이쓰면 헷갈림 + 소문자로 시작하는게 편함
		 * 식별자 identifier 
		 * */
		//소숫점 자료형 (float, double)
		float ff; 
		double dd;
		ff = 3.14f; 
		dd = 3.14; // 리터럴 "3.14"의 자료형은 double 이다
		System.out.println("ff = " + ff + "dd =" + dd);
		
		// 형변환 (casting) : 유사한 자료형으로 변한다.
		int x = 10;
		double y=100.34;
		x = (int)y; // explicit casting 적극적인
		// x = y; 불가능  warning 이거 아닌데 뭐 내가 해줄게 error 야 이거 내가 못해줘 
		y = x; // implicit casting 소극적인 y = (double) x; 사용해도 됨. :-) 
		
		System.out.println("x = " + x + "y =" + y);
		
	}

}
