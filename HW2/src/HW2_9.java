import java.util.Scanner;

public class HW2_9 { 
	public static void main(String[] args) {
		// 1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)
		// 9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, 
		// �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		int sum=0,i=1,a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� ");
		a = input.nextInt();
		
		if (a>=1 && a<=9)
			while (i<=9) {
				System.out.println(a + "*" + i + "=" + a * i);
				i++;
			}
		else
		System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
		
		
}

}

/*int sum=0,i=1,a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� ");
		a = input.nextInt();
		
		while (a>=1 && a<=9) {
		      input.next(); 
		      a = input.nextInt();
		    }

		if (a>=1 && a<=9)
			while (i<=9) {
				System.out.println(a + "*" + i + "=" + a * i);
				i++;
			}
		else
		System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
		*/