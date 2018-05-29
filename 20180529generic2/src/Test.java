
public class Test {
	public static void main(String[] args) {
		Box<String> box = new Box();
		String str = new String ("Hello");
		
		box.set(str);
		System.out.println("The box has " + box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		
		ibox.set(i);
		//error ibox.set(new String ("chois")); integer 형식을 넣어야 하는데 string error
		
		System.out.println(100 + ibox.get());
		
		
		
	}

}
