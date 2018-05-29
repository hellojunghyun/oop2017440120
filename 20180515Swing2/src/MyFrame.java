import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("jangs 2nd frame");
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		// setLayout(new FlowLayout()); // 플로우 배치 매니저 사용
		
		JLabel label = new JLabel("안녕하세요 반갑습니다"); //레이블 객체 생성
		JTextField tf = new JTextField(20);//텍스트필드 객체 생성
		JButton button = new JButton ("Jangs Button");
		
		button.setText("wasd");
		tf.setText("OPS,BABIP,WHIP,RISP");
		
		// 패널생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button);
		this.add(panel);
//		this.add(label); //레이블 객체를 프레임에 추가
//		this.add(tf);//텍스트필드 객체를 프레임에 추가
		
//		pack();//컴포넌트들을 꽉 채워서 프레임크기를 정함
		
		
		this.setVisible(true);
		//
	}

}
