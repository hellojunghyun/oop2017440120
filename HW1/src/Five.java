import java.util.Scanner;

public class Five {
	public static void main(String[] args) {
		/*5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		choose one of the following.
		apple
		orange
		banana
		peach

		enter your choice here : (����� �Է�)orange

		--------------
		Your choice is ��orange��. */
		String a;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("enter your choice here: ");
		a = scan.nextLine(); 
		
		if (a.equals("apple"))
			System.out.println("Your choice is ��apple.");
		else if (a.equals("orange"))
			System.out.println("Your choice is ��orange.");
		else if (a.equals("banana"))
			System.out.println("Your choice is ��banana.");
		else
			System.out.println("Your choice is ��peach.");
		System.out.println("==========���α׷� ����===========" );
		
		
	}

}