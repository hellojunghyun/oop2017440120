
public class loop {

	public static void main(String[] args) {
		// 1 ~ 10 ������ ȭ�鿡 ���
		int i; // i�� ��������
		i= 1;  // 1. �������� �ʱ�ȭ
		
		while (i<= 10) { // 2. ���� ���ǽ�
			System.out.println(i); // 3. ������
			i++;//4. �������� ��ȭ
						}
		System.out.println("==========���α׷� ����===========" );
		
		int sum=0 ;
		i = 1;
		while (i <= 10) {
			sum = sum + i ; 
			i++;
						} 			
		

		System.out.println("sum= " + sum);
		System.out.println("==========���α׷� ����===========" );
		
		for(i=1;i<=10;i++)
			System.out.println(i);
		
		System.out.println("==========���α׷� ����===========" );
		
		String str = "hello darkness my old friend";
		int count = 0;
		for(i = 0; i < str.length();i++) {
			if (str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰��� l�� ����" + count );
		System.out.println("==========���α׷� ����===========" );
			
		
	}
}
		

		
		
		
		
		


/*	
 * // 1 ~ 10 ������ ȭ�鿡 ���
		int i; // i�� ��������
		i= 1;  // 1. �������� �ʱ�ȭ
		while (i<= 10) { // 2. ���� ���ǽ�
			System.out.println(i); // 3. ������
			i++;//4. �������� ��ȭ
		}
		
		System.out.println("==========���α׷� ����===========" );
		
*/


		
	/*	int sum=0, i=1;
		
		while (i <= 10) {
			sum = sum + i ;
			System.out.println(sum); 
			i++;
		} 			System.out.println("==========���α׷� ����===========" );
		
		*/
	