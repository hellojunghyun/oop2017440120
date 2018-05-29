import java.util.Scanner;

public class HW2_9 { 
	public static void main(String[] args) {
		// 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		// 9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 
		// 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		int sum=0,i=1,a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
		a = input.nextInt();
		
		if (a>=1 && a<=9)
			while (i<=9) {
				System.out.println(a + "*" + i + "=" + a * i);
				i++;
			}
		else
		System.out.println("잘못된 숫자를 입력하였습니다.");
		
		
}

}

/*int sum=0,i=1,a=0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오 ");
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
		System.out.println("잘못된 숫자를 입력하였습니다.");
		*/