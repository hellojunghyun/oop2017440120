
public class object {

	public static void main(String[] args) {
		int a = 10; // int형의 변수 a 생성 + 값 10을 a에 저장 a는 원시 변수 primitive 
		//1.string 객체 생성
		String str;// 클라스 스트링의 객체를 참조할 수 있는 참조 변수 (레퍼런스 변수) 생성 참조변수 Reference
		str = new String ("Hello darkness my old friend."); // 객체생성
		
		//String 객체의 길이
		//메소드 호출 방법: 참조변수.메소드()
		int len = str.length();
		System.out.println("string length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}
/*~~~~-~_~_`_~_~__---~~-_~_~_~_~_~_~`-_~`-_~`-_~~__~~_~_~_~__~_`__~`-~_~_~_`-~-`_~-_`_~~-~~~___~_~__~-~`'~"~"~"~"`"~~'''~~~`*/