import java.util.Scanner;

public class HW2_11 {

	public static void main(String[] args) {
		//10. �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//8 => 2 4 
		//12 => 2 3 4 6
		//11. ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		int i=1,a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� ");
		a = input.nextInt();
		if (a!=0)
		while(i < a) {
			if (a%i == 0)
			System.out.println(i);
			i++;
		}

	}

}
