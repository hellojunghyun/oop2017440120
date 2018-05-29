
public class Testpoint {

	public static void main(String[] args) {
		
		Point pnt1 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		Point pnt2 = new Point();
		pnt2.setX(4.0); pnt2.setY(5.0);
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		//
		System.out.println(pnt2.distance(pnt1));
		
		//pnt1.print(); // 여기서 pnt가 this에서 부를때 나옴
		//pnt2.print();
		
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1);
		System.out.println(pnt2);
		//System.out.println("("+pnt.getX() + " " + pnt.getY()+")");
		
		
		

	}

}
