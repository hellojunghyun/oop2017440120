import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int a;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("ù��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		
		if (a%2 == 1)
			System.out.println("�� ���� Ȧ���Դϴ�");
		else
			System.out.println("�� ���� ¦���Դϴ�");
		System.out.println("==========���α׷� ����===========" );
		
		
		
		
		
	}
}
