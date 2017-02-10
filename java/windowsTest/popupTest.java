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
		super("JPopupMenu�d��");
		c = getContentPane();
		c.setBackground(Color.white);
		popup = new JPopupMenu();
		popup.add(red = new JMenuItem("����"));
		red.addActionListener(this);
		popup.add(green = new JMenuItem("���"));
		green.addActionListener(this);
		popup.add(blue = new JMenuItem("�Ŧ�"));
		blue.addActionListener(this);
		popup.addSeparator();//���j�u
		popup.add("����");//�ϥΦr��s�W�ﶵ
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent evt){
				if(evt.isPopupTrigger())//��ܿ��
					popup.show(evt.getComponent(), evt.getX(), evt.getY());
			}
			public void mouseReleased(MouseEvent evt){
				if(evt.isPopupTrigger())//��ܿ��
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
