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
		super("下拉式選單範例");
		c = getContentPane();
		c.setBackground(Color.white);
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);//新增下拉式選單
		JMenu file = new JMenu("檔案(F)");
		file.setMnemonic(KeyEvent.VK_F);
		JMenuItem item;
		file.add(item = new JMenuItem("新增(A)", KeyEvent.VK_A));
		item.addActionListener(this);
		file.add(item = new JMenuItem("開啟(O)", KeyEvent.VK_O));
		item.addActionListener(this);
		JMenu setting = new JMenu("參數設定"); //子選單
		setting.add(item = new JMenuItem("編碼"));
		item.addActionListener(this);
		setting.add(item = new JMenuItem("字型"));
		item.addActionListener(this);
		file.add(setting);
		file.addSeparator();
		file.add(item = new JMenuItem("關閉(X)", KeyEvent.VK_X));
		item.addActionListener(this);
		jmb.add(file);
		JMenu choice = new JMenu("選項(C)");
		choice.setMnemonic(KeyEvent.VK_C);
		JCheckBoxMenuItem check;
		check = new JCheckBoxMenuItem("切換");
		check.addActionListener(this);
		choice.add(check);
		ButtonGroup bg = new ButtonGroup();
		red = new JRadioButtonMenuItem("紅色");
		choice.add(red);
		bg.add(red);
		red.addActionListener(this);
		green = new JRadioButtonMenuItem("綠色");
		choice.add(green);
		bg.add(green);
		green.addActionListener(this);
		blue = new JRadioButtonMenuItem("藍色");
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
