import java.util.Scanner;

public class HW2_21 {
	public static void main(String[] args) {
		//21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int sum=0,i=2,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� ");
		a = input.nextInt();
		
		while(i < a) {
			if (a%i == 0)
				sum = sum + i;
			i++;
	}
		System.out.println("�Է¹��� ���� ������ �Ҽ����� �� "+ sum);
	}

}
