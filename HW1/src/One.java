import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("ù��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		
		if (a>b)
			System.out.println("ù��° ������ Ů�ϴ�");
		else
			System.out.println("�ι�° ������ Ů�ϴ�");
		System.out.println("==========���α׷� ����===========" );
		
		
	}

}