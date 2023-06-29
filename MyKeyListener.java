package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{

	
	public void keyTyped(KeyEvent e) {
			//System.out.println("keyTyped호출");	
	}

	//키누를때 js의 keydown 총알
	public void keyPressed(KeyEvent e) {
			//System.out.println("keyPressed호출");
	}

	//키눌렀다 뗼때 js의 keyup 타자
	public void keyReleased(KeyEvent e) {
			//System.out.println("KeyReleased 호출");
	}

}
