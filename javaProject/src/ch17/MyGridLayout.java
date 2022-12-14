package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout extends JFrame {
	public MyGridLayout() {
	super("MyGridLayout 과제");
	setLayout(new GridLayout(4, 2));
	
	JButton btn1 = new JButton("id");
	JButton btn2 = new JButton("hong");
	JButton btn3 = new JButton("비밀번호");
	JButton btn4 = new JButton("****");
	JButton btn5 = new JButton("이메일");
	JButton btn6 = new JButton("hong@daum.net");
	JButton btn7 = new JButton("HP");
	JButton btn8 = new JButton("010-1234-5678");
	
	add(btn1);
	add(btn2);
	add(btn3);
	add(btn4);
	add(btn5);
	add(btn6);
	add(btn7);
	add(btn8);
	
	setSize(500, 500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
