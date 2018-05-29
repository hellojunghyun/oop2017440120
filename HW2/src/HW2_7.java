import java.util.Scanner;

public class HW2_7 {
	public static void main(String[] args) {
		//7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		int sum=0;
		int a = 0;
		Scanner input = new Scanner(System.in);
		 
		while (true) { 
			System.out.println("정수를 입력하시오 ");
			a = input.nextInt();
			if (a==0)
				break;
			sum = sum + a;
			
						}
		System.out.println("입력된 모든 숫자들의 총합 = " + sum);
		
	}

}


