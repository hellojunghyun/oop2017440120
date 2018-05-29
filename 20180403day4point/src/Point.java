
public class Point {
	// �ʵ��� scope (��ȿ����)�� Ŭ���� �����̴�.
	private double x;
	private double y;
	
	public void setX(double xx) {
		this.x = xx;
		xx = 100;
		
	}
	
	public void setY(double yy) {
		this.y = yy;
		
	}
	
	public double getX(double xx) {
		return x;
		
	}
	
	public double getY(double yy) {
		return y;
		
	}
	
	
	public double distance() {
		//��ȯ�� ���� ����
		double result; // ���� ������ ��ȿ������ �޼ҵ� �����̴�.
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
	
	
	public Point move(Point p) { // �Ű�����  p �� ��ȿ������ �޼ҵ� ����
		
		//temp ��������
		double a;
		double b;
		
		//point p ��ŭ �̵�
		a= this.x + p.x; // this �ʵ忡�� �������� ������� �ȳ����ذ�.
		b= this.y + p.y;
		
		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
	

}
