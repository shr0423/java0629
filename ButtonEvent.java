package org.sp.app0629.event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	JButton bt;
	JTextField t;
	
	public ButtonEvent() {
		bt=new JButton("나버튼");
		t=new JTextField(25);//15자만 허용X, 최초 생성시 15자 크기를 확보한다
		
		//레이아웃 변경
		this.setLayout(new FlowLayout());
		
		add(bt);//버튼 부착
		add(t);//버튼 부착
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼과 이벤트 감지자인 리스너를 연결하자
		MyListener m=new MyListener();
		bt.addActionListener(m);//버튼과 리스너와의 연결
		
		//텍스트필드와 리스너와의 연결
		t.addKeyListener(new MyKeyListener());
	}
	
	public static void main(String[] args) {
		new ButtonEvent();
	}
}
