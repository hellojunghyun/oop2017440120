import java.util.Scanner;

public class HW2_19 {
	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		int i=2,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
		a = input.nextInt();
		
		while(i < a) {
			if (a%i == 0)
				b=1;
			i++;
	}
		if (b==1)
			System.out.println("이 수는 소수가 아닙니다. ");
		else
			System.out.println("이 수는 소수입니다. ");

}
}