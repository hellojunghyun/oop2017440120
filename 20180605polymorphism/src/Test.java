
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aDog = new Dog("tina"); //Animal ~~ : playFetch 메소드 불가
		Animal aCat = new Cat("망고"); // Cat -> Animal _> upcasting

		///////////
		
		aDog.sing();
		// error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch(); // downcasting
		((Dog) aDog).playFetch();
		//error ((Cat) aCat).playFetch();
		aCat = new Dog("해피");
		((Dog) aCat).playFetch(); // error Cat cannot be cast to Dog
		aCat.sing();
	}

}
