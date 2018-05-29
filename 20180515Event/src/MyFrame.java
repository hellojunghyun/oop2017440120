import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JButton btn;
	JTextField tf;
	MyFrame(){
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("jangs event");
		
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		JButton button = new JButton ("Jangs Button");
		this.add(this.button);
		this.button.setActionCommand("button1");
		MyListener listener = new MyListener(); 
		button.addActionListener(listener);//이벤ㅌ으 리슽어 객체 등록
		
		this.btn = new JButton("두번째 버튼");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);
		
		tf = new JTextField(20);
		this.add(tf);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if((e.getActionCommand()).equals("button1"))
			this.tf.setText("첫번째버튼");
		else
			this.tf.setText("두번째버튼");
		// 액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값)을 가져온다.
				
	}


	}
