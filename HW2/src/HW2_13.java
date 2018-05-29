import java.util.Scanner;

public class HW2_13 {

	public static void main(String[] args) {
		//13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. 
		// (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int i=0,a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("몇월인지 입력하시오 ");
		a = input.nextInt();
		System.out.println("며칠인지 입력하시오 ");
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
		System.out.println("1월 1일부터의 총 day수는 = " + i);

}
}
