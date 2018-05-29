package g2017440120;

import java.util.Scanner;

public class conditionalstatement {

	public static void main(String[] args) {
		int score, good = 0, bad = 0;
		System.out.print("성적을 입력하세요: ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		System.out.println("성적은 " + score + "점입니다" );
		
		//성적이 60점 이상히면 "합격입니다", 60점 미만이면 '불힙격입니다'를 츨력하시오]
		// 비교 >= : 관계연산자
		// if (조건식) 참일 경우 else 거짓일 경우 수행
		
		if (score >= 60) {
			System.out.println("Pass" ); 
			good++;
		} // 복합문 (compound Statement) : 여러 문장을 중괄호 {}로 묶어 하나의 문장으로 처리
		else {
			System.out.println("Unpass" );
			bad++;
		}
		
		// 성적이 80 점 이상이면 A 60점 이상이면 B 60점 미만이면 F
		if (score >= 80) 
			System.out.println("Your Grade is A" ); 
			
		else if (score >= 60) 
			System.out.println("Your Grade is B" ); 
			
		else 
			System.out.println("Your Grade is F" ); // 조건문 하나의 블럭 grade_pic 참고
		

		//0-> "없음" 1-> "하나" 2-> "둘", 0/1/2가 아니면 "많음"을 출력
		switch (score) {
		case 0:
			System.out.println("없음" );
			break;
		case 1:
			System.out.println("하나" );
			break;
		case 2:
			System.out.println("둘" );
			break;
		default:
			System.out.println("많음" );
			break;	
		}
		System.out.println("=================프로그램 종료===================" );
		
			
		

		
		
		
		
		
		
		
		
	}

}
