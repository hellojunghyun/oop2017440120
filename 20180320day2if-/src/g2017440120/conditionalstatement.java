package g2017440120;

import java.util.Scanner;

public class conditionalstatement {

	public static void main(String[] args) {
		int score, good = 0, bad = 0;
		System.out.print("������ �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt();
		System.out.println("������ " + score + "���Դϴ�" );
		
		//������ 60�� �̻����� "�հ��Դϴ�", 60�� �̸��̸� '�������Դϴ�'�� �����Ͻÿ�]
		// �� >= : ���迬����
		// if (���ǽ�) ���� ��� else ������ ��� ����
		
		if (score >= 60) {
			System.out.println("Pass" ); 
			good++;
		} // ���չ� (compound Statement) : ���� ������ �߰�ȣ {}�� ���� �ϳ��� �������� ó��
		else {
			System.out.println("Unpass" );
			bad++;
		}
		
		// ������ 80 �� �̻��̸� A 60�� �̻��̸� B 60�� �̸��̸� F
		if (score >= 80) 
			System.out.println("Your Grade is A" ); 
			
		else if (score >= 60) 
			System.out.println("Your Grade is B" ); 
			
		else 
			System.out.println("Your Grade is F" ); // ���ǹ� �ϳ��� �� grade_pic ����
		

		//0-> "����" 1-> "�ϳ�" 2-> "��", 0/1/2�� �ƴϸ� "����"�� ���
		switch (score) {
		case 0:
			System.out.println("����" );
			break;
		case 1:
			System.out.println("�ϳ�" );
			break;
		case 2:
			System.out.println("��" );
			break;
		default:
			System.out.println("����" );
			break;	
		}
		System.out.println("=================���α׷� ����===================" );
		
			
		

		
		
		
		
		
		
		
		
	}

}
