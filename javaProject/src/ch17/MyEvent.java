package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;

public class MyEvent extends JFrame{
	public MyEvent() {
	setLayout(new BorderLayout());
	
	Button b1=new Button("east");
	Button b2=new Button("west");
	Button b3=new Button("south");
	Button b4=new Button("north");
	
	add(b1, "East"); add(b2, "West"); add(b3, "South"); add(b4, "North");
	b1.addActionListener(new MyEventColor(this, Color.green));
	b2.addActionListener(new MyEventColor(this, Color.yellow));
	b3.addActionListener(new MyEventColor(this, Color.blue));
	b4.addActionListener(new MyEventColor(this, Color.red));
	
	b1.setBackground(Color.green);
	b2.setBackground(Color.yellow);
	b3.setBackground(Color.blue);
	b4.setBackground(Color.red);
	
	setSize(600, 500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyEvent();
	}
}


