import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
//		//error aaa.eat();
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ���� ����. �캯 <-- �º�
		//Upcasting
		//Animal aaa = new Dog();
		Animal aaa = (Animal) new Dog();
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �żҵ尡 ����ȴ�
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. superClass SuperrefVar = new SubClass();
		//4. superRefVar.overridedMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();//���� ���ε�(Dynamic Binding): ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		// �߻�Ŭ�󽺴� ��ü�� ���� �� ����. aaa = new Animal();
		
		
		int a;
		a = (int) 3.1; //����ȯ(type casting)
		System.out.println(a);
		
	}

}
