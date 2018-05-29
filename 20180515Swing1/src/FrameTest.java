import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("jangs frame");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //class.static변수 ( 대문자로 끝나면 상수
		frame.setVisible(true);
		//
	}

}
