import java.util.*;


public class TestQuene {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>();//���ĺ������� �����
		strs.add("trump"); //ť �� ���� ��Ҹ� �߰�
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while (!strs.isEmpty()) {//for ���Ÿ�� ��������: �ݷ��Ǻ���
			String str2;
			str2 = strs.remove();//ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			System.out.println(str2);
			Thread.sleep(777);//0.777�� ��ٷ�
		} 
		
	}
}
