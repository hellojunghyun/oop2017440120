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
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		JButton button = new JButton ("Jangs Button");
		this.add(this.button);
		this.button.setActionCommand("button1");
		MyListener listener = new MyListener(); 
		button.addActionListener(listener);//�̺����� ������ ��ü ���
		
		this.btn = new JButton("�ι�° ��ư");
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
			this.tf.setText("ù��°��ư");
		else
			this.tf.setText("�ι�°��ư");
		// �׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����)�� �����´�.
				
	}


	}
