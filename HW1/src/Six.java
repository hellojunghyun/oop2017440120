import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		/*� �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		����� �Է� : �� ���� �� �ڸ� ����
		��� : �ڸ����� ������ �ݴ�� �� ���� */
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		
		if (a>=10 && a<=99) {
			b = a / 10;
			c = a % 10;
			d = 10 * c + b;
			System.out.println("�ڸ����� ������ �ݴ�� �� ������ " + d); 
		}
		else
			System.out.println("�Ѱ��� ���ڸ� ������ �Է����ֽʽÿ�");
		System.out.println("==========���α׷� ����===========" );
		
	}

}
