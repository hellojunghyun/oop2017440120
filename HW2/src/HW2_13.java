import java.util.Scanner;

public class HW2_13 {

	public static void main(String[] args) {
		//13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		// (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		int i=0,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������� �Է��Ͻÿ� ");
		a = input.nextInt();
		System.out.println("��ĥ���� �Է��Ͻÿ� ");
		b = input.nextInt();
		switch (a) {
        case 1:  i = 0+b;
                 break;
        case 2:  i = 31+b;
                 break;
        case 3:  i = 59+b;
                 break;
        case 4:  i = 90+b;
                 break;
        case 5:  i = 120+b;
                 break;
        case 6:  i = 151+b;
                 break;
        case 7:  i = 181+b;
                 break;
        case 8:  i = 212+b;
                 break;
        case 9:  i = 243+b;
                 break;
        case 10: i = 273+b;
                 break;
        case 11: i = 304+b;
                 break;
        case 12: i = 334+b;
                 break;	
	}
		System.out.println("1�� 1�Ϻ����� �� day���� = " + i);

}
}
