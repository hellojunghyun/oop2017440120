import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("ù��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ�: ");
		c = input.nextInt();
		
		if (a>b && a>c)
			System.out.println("ù��° ������ Ů�ϴ�");
		else if (b>c)
			System.out.println("�ι�° ������ Ů�ϴ�");
		else
			System.out.println("����° ������ Ů�ϴ�");
		System.out.println("==========���α׷� ����===========" );
		
		
	}

}

/*		if (a>b && a>c)
			System.out.println("ù��° ������ Ů�ϴ�");
		if (b>a && b>c)
			System.out.println("�ι�° ������ Ů�ϴ�");
		if (c>a && c>b)
			System.out.println("����° ������ Ů�ϴ�");
 */