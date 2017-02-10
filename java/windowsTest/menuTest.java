package windowsTest;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class menuTest extends JFrame implements ActionListener{
	private JRadioButtonMenuItem red, green, blue;
	private Container c;
	public menuTest(){
		super("�U�Ԧ����d��");
		c = getContentPane();
		c.setBackground(Color.white);
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);//�s�W�U�Ԧ����
		JMenu file = new JMenu("�ɮ�(F)");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem item;
		file.add(item = new JMenuItem("�s�W(A)", KeyEvent.VK_A));
		item.addActionListener(this);
		file.add(item = new JMenuItem("�}��(O)", KeyEvent.VK_O));
		item.addActionListener(this);
		JMenu setting = new JMenu("�ѼƳ]�w"); //�l���
		setting.add(item = new JMenuItem("�s�X"));
		item.addActionListener(this);
		setting.add(item = new JMenuItem("�r��"));
		item.addActionListener(this);
		file.add(setting);
		file.addSeparator();
		file.add(item = new JMenuItem("����(X)", KeyEvent.VK_X));
		item.addActionListener(this);
		jmb.add(file);
		JMenu choice = new JMenu("�ﶵ(C)");
		choice.setMnemonic(KeyEvent.VK_C);
		JCheckBoxMenuItem check;
		check = new JCheckBoxMenuItem("����");
		check.addActionListener(this);
		choice.add(check);
		ButtonGroup bg = new ButtonGroup();
		red = new JRadioButtonMenuItem("����");
		choice.add(red);
		bg.add(red);
		red.addActionListener(this);
		green = new JRadioButtonMenuItem("���");
		choice.add(green);
		bg.add(green);
		green.addActionListener(this);
		blue = new JRadioButtonMenuItem("�Ŧ�");
		choice.add(blue);
		bg.add(blue);
		blue.addActionListener(this);
		jmb.add(choice);
	}
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == red)
			c.setBackground(Color.red);
		if(evt.getSource() == green)
			c.setBackground(Color.green);
		if(evt.getSource() == green)
			c.setBackground(Color.blue);
		repaint();
	}
	public static void main(String[] args) {
		menuTest app = new menuTest();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		app.setSize(300, 300);
		app.setVisible(true);
	}

}
