import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값)을 가져온다.
		JButton button = (JButton) e.getSource();
		button.setText("버튼이 눌러졌어요!");
		System.out.println("OMG 버튼이 눌러졌어요!!");
		
	}
	

}
