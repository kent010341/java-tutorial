package windowsTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class basicLayout extends JFrame{
	private JLabel txt;
	public basicLayout(){
		super("基本視窗範例");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		txt = new JLabel("文字範例");
		c.add(txt);
	}
	public static void main(String[] args) {
		basicLayout app = new basicLayout();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(300, 100);
		app.setVisible(true);
	}

}
