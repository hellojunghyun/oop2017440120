package jih;

public class Dog extends Animal {
	public Dog() { //����Ʈ ������
		//����� ����Ŭ���� ������ ȣ�� super();
		System.out.println("Dog default ������");
	} 
	public Dog(int a) {
		super(3);
		System.out.println("Dog ������ ������");
	} 

}
//�����ڵ� ����� �޴´�
//subclass 4-5�� ������ ���� ����������