import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		/*5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		choose one of the following.
		apple
		orange
		banana
		peach

		enter your choice here : (사용자 입력)orange

		--------------
		Your choice is “orange”. */
		String a;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("enter your choice here: ");
		a = scan.nextLine(); 
		
		if (a.equals("apple"))
			System.out.println("Your choice is “apple.");
		else if (a.equals("orange"))
			System.out.println("Your choice is “orange.");
		else if (a.equals("banana"))
			System.out.println("Your choice is “banana.");
		else
			System.out.println("Your choice is “peach.");
		System.out.println("==========프로그램 종료===========" );
		
		
	}

}