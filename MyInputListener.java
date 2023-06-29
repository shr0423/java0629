package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyInputListener implements KeyListener{

	
	public void keyTyped(KeyEvent e) {
		
		
	}

	
	public void keyPressed(KeyEvent e) {
		System.out.println("키눌렀어?");
		
	}

	
	public void keyReleased(KeyEvent e) {
		
		System.out.println("키 눌렀다떼었어?");
	}

	
}
