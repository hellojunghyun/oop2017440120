import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdderHW extends JFrame implements ActionListener {
 JTextField tf;
 JPanel panel;
 JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13; 
 String val1 = null, val2 = null, sign = null; 
 Double result = 0.0; 

  public AdderHW() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  tf = new JTextField("0", 20);
  tf.setHorizontalAlignment(JTextField.RIGHT); 
  
  b1 = new JButton("c"); b2 = new JButton("+"); b3 = new JButton("="); 
  b4 = new JButton("7"); b5 = new JButton("8"); b6 = new JButton("9"); 
  b7 = new JButton("4"); b8 = new JButton("5"); b9 = new JButton("6");
  b10 = new JButton("1"); b11 = new JButton("2"); b12 = new JButton("3");
  b13 = new JButton("0"); 
  
  panel = new JPanel();
  panel.setLayout(new GridLayout(5, 4, 2, 2));
  
  panel.add(b1); panel.add(b2); panel.add(b3); 
  panel.add(b4); panel.add(b5); panel.add(b6); 
  panel.add(b7); panel.add(b8); panel.add(b9); 
  panel.add(b10); panel.add(b11); panel.add(b12);
  panel.add(b13);
  
  add(tf, "North");
  add(panel); 
  
  b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this);
  b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); 
  b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);
  b10.addActionListener(this); b11.addActionListener(this); b12.addActionListener(this);
  b13.addActionListener(this);

  setTitle("Adder");
  setSize(300, 300);
  setVisible(true);
 }

  public static void main(String[] args) {
  new AdderHW();
 }

  @Override 
 public void actionPerformed(ActionEvent e){
   String data = e.getActionCommand(); 

   if(data.equals("0") || data.equals("1") || data.equals("2") || data.equals("3") || data.equals("4") || data.equals("5") || data.equals("6") || data.equals("7") || data.equals("8") || data.equals("9")){
   if((tf.getText()).equals("0"))
    tf.setText(""); 
   val1 = tf.getText() + data; 
   tf.setText(val1);
  }
   
   if(data.equals("+")){ 
    tf.setText("");
    if(val1 != null){
     val2 = val1;
     val1 = null;
    }
    sign = "+";
   }

    if(data.equals("=")){ 
    if(sign.equals("+"))
     result = Double.parseDouble(val2) + Double.parseDouble(val1);

     tf.setText("");
    val2 = String.valueOf(result);
    tf.setText(val2);
    val1 = null;
   }
  
   if(data.equals("c")){ 
   tf.setText("0");
   val1 = null;
   val2 = null;
   result = 0.0;
  }
 }
}