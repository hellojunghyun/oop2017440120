import java.util.Scanner;

public class HW2_7 {
	public static void main(String[] args) {
		//7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int sum=0;
		int a = 0;
		Scanner input = new Scanner(System.in);
		 
		while (true) { 
			System.out.println("������ �Է��Ͻÿ� ");
			a = input.nextInt();
			if (a==0)
				break;
			sum = sum + a;
			
						}
		System.out.println("�Էµ� ��� ���ڵ��� ���� = " + sum);
		
	}

}


