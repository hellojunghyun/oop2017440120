
public class HW2_23 {

	public static void main(String[] args) {
		/* 23.***** *
		*** ***
		* *****

		를 출력하시오(반복문 써서!)
		*/
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if(i==0 && j==5)
					System.out.print(" ");
				if(i==1 && j==3)
					System.out.print(" ");
				if(i==2 && j==1)
					System.out.print(" ");

                System.out.print("*");
                
		}
			System.out.println("");
			
        }
	


}
}