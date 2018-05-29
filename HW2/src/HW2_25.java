
public class HW2_25 { 
	public static void main(String[] args) {
		/* 25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		(1) *********** (2)54321012345
		********* 432101234
		******* 3210123
		***** 21012
		*** 101
		* 0
		*** 101 
		***** 21012 
		******* 3210123 
		********* 432101234 
		*********** 54321012345
		*)/   */
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 11-2*i; j++) {
				

                System.out.print("*");
                
		}
			System.out.println("");
			
        }
		
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 2*i+1; j++) {
				

                System.out.print("*");
                
		}
			System.out.println("");
			
        }
		
		
}

}
