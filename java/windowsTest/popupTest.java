package windowsTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class popupTest extends JFrame implements ActionListener{
	private JPopupMenu popup;
	private JMenuItem red, green, blue;
	private Container c;
	public popupTest(){
		super("JPopupMenu範例");
		c = getContentPane();
		c.setBackground(Color.white);
		popup = new JPopupMenu();
		popup.add(red = new JMenuItem("紅色"));
		red.addActionListener(this);
		popup.add(green = new JMenuItem("綠色"));
		green.addActionListener(this);
		popup.add(blue = new JMenuItem("藍色"));
		blue.addActionListener(this);
		popup.addSeparator();//分隔線
		popup.add("黃色");//使用字串新增選項
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent evt){
				if(evt.isPopupTrigger())//顯示選單
					popup.show(evt.getComponent(), evt.getX(), evt.getY());
			}
			public void mouseReleased(MouseEvent evt){
				if(evt.isPopupTrigger())//顯示選單
					popup.show(evt.getComponent(), evt.getX(), evt.getY());
			}
		});
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == red)
			c.setBackground(Color.red);
		if(evt.getSource() == green)
			c.setBackground(Color.green);
		if(evt.getSource() == blue)
			c.setBackground(Color.blue);
		repaint();
	}
	
	public static void main(String[] args) {
		popupTest app = new popupTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(500, 500);
		app.setVisible(true);
	}

}
