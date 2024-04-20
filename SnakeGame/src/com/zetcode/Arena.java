package com.zetcode;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JPanel;

public class Arena extends JPanel implements ActionListener {

	//Final constant ints that won't be changed
	private final int A_WIDTH  = 400;
	private final int A_HEIGHT = 400;
	private final int DELAY = 140;
	private final int DOT_SIZE = 10;
	private final int ALL_DOTS = 1200;
	private final int RANDOM_POSITION = 29;
	
	//Final arrays for the arena that won't be changed
	private final int x[] = new int[ALL_DOTS];
	private final int y[] = new int[ALL_DOTS];
	
	private int dots;
	private int apple_x;
	private int apple_y;
	
	//Controls booleans
	private boolean isLeft = false;
	private boolean isRight = false;
	private boolean isUp = false;
	private boolean isDown = false;
	private boolean inGame = true;
	
	private Timer timer;
	private Image goal;
	private Image apple;
	private Image head;
}
