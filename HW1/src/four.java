import java.util.Scanner;

public class four {
	public static void main(String[] args) {
		//����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		
		if (a>=80 && a<=100)
			System.out.println("����� ����� A�Դϴ�");
		else if (a>=60 && a<=79)
			System.out.println("����� ����� B�Դϴ�");
		else if (a>=40 && a<=59)
			System.out.println("����� ����� C�Դϴ�");
		else if (a>=20 && a<=39)
			System.out.println("����� ����� D�Դϴ�");
		else
			System.out.println("����� ����� E�Դϴ�");
		System.out.println("==========���α׷� ����===========" );
		
		
	}

}
