
public class object {

	public static void main(String[] args) {
		int a = 10; // int���� ���� a ���� + �� 10�� a�� ���� a�� ���� ���� primitive 
		//1.string ��ü ����
		String str;// Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� ���� ���� (���۷��� ����) ���� �������� Reference
		str = new String ("Hello darkness my old friend."); // ��ü����
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�()
		int len = str.length();
		System.out.println("string length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}
/*~~~~-~_~_`_~_~__---~~-_~_~_~_~_~_~`-_~`-_~`-_~~__~~_~_~_~__~_`__~`-~_~_~_`-~-`_~-_`_~~-~~~___~_~__~-~`'~"~"~"~"`"~~'''~~~`*/