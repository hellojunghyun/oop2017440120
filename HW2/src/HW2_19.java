import java.util.Scanner;

public class HW2_19 {
	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int i=2,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� ");
		a = input.nextInt();
		
		while(i < a) {
			if (a%i == 0)
				b=1;
			i++;
	}
		if (b==1)
			System.out.println("�� ���� �Ҽ��� �ƴմϴ�. ");
		else
			System.out.println("�� ���� �Ҽ��Դϴ�. ");

}
}