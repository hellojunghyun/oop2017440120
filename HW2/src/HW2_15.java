import java.util.Scanner;

public class HW2_15 {
	public static void main(String[] args) {
		/*15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)

		��) ���� 49�� ���:

		���ڸ� �Է��Ͻÿ�: 36
		�Է��Ͻ� ���ں��� Ů�ϴ�.

		���ڸ� �Է��Ͻÿ�: 51
		�Է��Ͻ� ���ں��� �۽��ϴ�.

		���ڸ� �Է��Ͻÿ�: 49
		�����Դϴ�!
		 * */
		int a=0, i=0;
		int b = (int)(Math.random()*100)+1; 
		while (i<=10) {
			System.out.println("���ڸ� �Է��Ͻÿ� ");
			Scanner input = new Scanner(System.in);
			a = input.nextInt();
			if (a < b)
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
			if (a > b)
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			if (a == b)
				System.out.println("�����Դϴ�.");
			i++;
		}
		System.out.println("Game Over");
		
	}

}
