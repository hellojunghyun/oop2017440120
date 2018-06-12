import java.util.*;


public class TestQuene {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//알파벳순으로 저장됨
		strs.add("trump"); //큐 맨 끝에 요소를 추가
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while (!strs.isEmpty()) {//for 요소타입 참조변수: 콜렉션변수
			String str2;
			str2 = strs.remove();//큐 맨 앞에서 요소를 제가하여 그 요소를 반환
			System.out.println(str2);
			Thread.sleep(777);//0.777초 기다려
		} 
		
	}
}
