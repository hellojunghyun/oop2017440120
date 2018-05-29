import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		/*어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		사용자 입력 : 한 개의 두 자리 정수
		출력 : 자릿수의 순서가 반대로 된 정수 */
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하시오: ");
		a = input.nextInt();
		
		if (a>=10 && a<=99) {
			b = a / 10;
			c = a % 10;
			d = 10 * c + b;
			System.out.println("자릿수의 순서가 반대로 된 정수는 " + d); 
		}
		else
			System.out.println("한개의 두자리 정수를 입력해주십시오");
		System.out.println("==========프로그램 종료===========" );
		
	}

}
