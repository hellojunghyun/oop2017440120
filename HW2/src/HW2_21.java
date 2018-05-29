import java.util.Scanner;

public class HW2_21 {
	public static void main(String[] args) {
		//21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int sum=0,i=2,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
		a = input.nextInt();
		
		while(i < a) {
			if (a%i == 0)
				sum = sum + i;
			i++;
	}
		System.out.println("입력받은 숫자 이하의 소수들의 합 "+ sum);
	}

}
