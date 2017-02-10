package windowsTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseEventTest extends JFrame implements MouseListener{
	
	private JTextField txt;
	public MouseEventTest(){
		super("基本滑鼠事件處理範例");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		txt = new JTextField(12);
		txt.addMouseListener(this);
		txt.setBackground(Color.white);
		c.add(txt);
	}
	
	public void mousePressed(MouseEvent evt){
		txt.setText("mousePressed");
	}
	
	public void mouseEntered(MouseEvent evt){
		txt.setText("mouseEntered");
	}
	
	public void mouseExited(MouseEvent evt){
		txt.setText("mouseExited");
	}
	
	public void mouseClicked(MouseEvent evt){}
	public void mouseReleased(MouseEvent evt){}
	
	public static void main(String[] args) {
		MouseEventTest app = new MouseEventTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(300, 100);
		app.setVisible(true);
	}

}
