import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("jangs 2nd frame");
		//���ο� ������Ʈ�� �����ӿ� �߰�
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		// setLayout(new FlowLayout()); // �÷ο� ��ġ �Ŵ��� ���
		
		JLabel label = new JLabel("�ȳ��ϼ��� �ݰ����ϴ�"); //���̺� ��ü ����
		JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton ("Jangs Button");
		
		button.setText("wasd");
		tf.setText("OPS,BABIP,WHIP,RISP");
		
		// �гλ���
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		this.add(button);
		this.add(panel);
//		this.add(label); //���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		
//		pack();//������Ʈ���� �� ä���� ������ũ�⸦ ����
		
		
		this.setVisible(true);
		//
	}

}
