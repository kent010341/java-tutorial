package windowsTest;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class radioTest extends JFrame implements ActionListener{
	private JRadioButton rdb1, rdb2;
	private JLabel lbl;
	
	public radioTest(){
		super("JRadioButton範例");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		lbl = new JLabel("");
		ButtonGroup buttonGroup = new ButtonGroup();
		rdb1 = new JRadioButton("是(Y)");
		rdb1.setMnemonic(KeyEvent.VK_Y);
		rdb1.setSelected(true);//預選
		buttonGroup.add(rdb1);
		rdb2 = new JRadioButton("否(N)");
		rdb2.setMnemonic(KeyEvent.VK_N);
		buttonGroup.add(rdb2);
		
		JButton btn = new JButton("選擇");
		btn.addActionListener(this);
		JPanel jpane = new JPanel();
		c.add(jpane);
		jpane.add(rdb1);
		jpane.add(rdb2);
		jpane.add(lbl);
		jpane.add(btn);
	}
	
	public void actionPerformed(ActionEvent evt){
		if(rdb1.isSelected())
			lbl.setText("選擇了：是");
		if(rdb2.isSelected())
			lbl.setText("選擇了：否");
		repaint();//重繪
	}
	
	public static void main(String[] args) {
		radioTest app = new radioTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(350, 100);
		app.setVisible(true);
	}
}
