
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aDog = new Dog("tina"); //Animal ~~ : playFetch �޼ҵ� �Ұ�
		Animal aCat = new Cat("����"); // Cat -> Animal _> upcasting

		///////////
		
		aDog.sing();
		// error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch(); // downcasting
		((Dog) aDog).playFetch();
		//error ((Cat) aCat).playFetch();
		aCat = new Dog("����");
		((Dog) aCat).playFetch(); // error Cat cannot be cast to Dog
		aCat.sing();
	}

}
