package windowsTest;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonTest extends JFrame implements ActionListener{
	private JLabel lbl;
	private JButton btn1, btn2;
	private int count = 0;
	public ButtonTest(){
		super("JButton與JLabel範例");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		lbl = new JLabel("計數器：" + count);	//預設顯示文字
		btn1 = new JButton("+1(A)");
		btn1.addActionListener(this);
		btn1.setMnemonic(KeyEvent.VK_A);//快捷鍵，此為Alt+A
		btn2 = new JButton("-1(M)");
		btn2.addActionListener(this);
		btn2.setMnemonic(KeyEvent.VK_M);
		JPanel jpane = new JPanel();
		c.add(jpane);
		jpane.add(lbl);
		jpane.add(btn1);
		jpane.add(btn2);
	}
	
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == btn1)
			count++;
		if(evt.getSource() == btn2)
			count--;
		lbl.setText("計數器：" + count);
	}
	
	public static void main(String[] args) {
		ButtonTest app = new ButtonTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(350, 100);
		app.setVisible(true);
	}

}
