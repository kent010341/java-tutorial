package windowsTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class MouseDragTest extends JFrame{
	private boolean isDragging;
	private int x, y;
	private int preX, preY;
	
	public MouseDragTest(){
		super("·Æ¹«©ì¦²¨Æ¥ó½d¨Ò");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.white);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent evt){
				if(isDragging == true) return;
				isDragging = true;
				x = evt.getX();	y = evt.getY();
				preX = x;	preY = y;
			}
			public void mouseReleased(MouseEvent evt){
				isDragging = false;
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent evt){
				if(isDragging == false) return;
				int tmpX = evt.getX(), tmpY = evt.getY();
				Graphics g = getGraphics();
				g.setColor(Color.blue);
				g.drawLine(preX, preY, tmpX, tmpY);
				preX = tmpX;	preY = tmpY;
			}
		});
	}
	
	public static void main(String[] args) {
		MouseDragTest app = new MouseDragTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(500, 500);
		app.setVisible(true);
	}

}
