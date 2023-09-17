package javaPackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator {
	
	private static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	private static JLabel label;
	
	public Calculator() {
		
	}
	
	public static void main(String[] args) {
		panel = new JPanel();
		button = new JButton();
		
		//Create and set up window
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(225, 340);
		frame.add(panel);
		panel.setLayout(null);
		
		//Place the buttons on the screen
		placeButtons();
		
		//Display Window
		frame.setVisible(true);
	}
	
	public static void placeButtons() {
		
		
		
		//Number 0
		JButton number0 = new JButton("0");
		number0.setBounds(0, 250, 100, 50);
		panel.add(number0);
		
		//Number 1
		JButton number1 = new JButton("1");
		number1.setBounds(0, 200, 50, 50);
		panel.add(number1);
		
		//Number 2
		JButton number2 = new JButton("2");
		number2.setBounds(50, 200, 50, 50);
		panel.add(number2);
		
		//Number 3
		JButton number3 = new JButton("3");
		number3.setBounds(100, 200, 50, 50);
		panel.add(number3);
		
		//Number 4
		JButton number = new JButton("4");
		number.setBounds(0, 150, 50, 50);
		panel.add(number);
		
		//Number 5
		JButton number5 = new JButton("5");
		number5.setBounds(50, 150, 50, 50);
		panel.add(number5);
		
		//Number 6
		JButton number6 = new JButton("6");
		number6.setBounds(100, 150, 50, 50);
		panel.add(number6);
		
		//Number 7
		JButton number7 = new JButton("7");
		number7.setBounds(0, 100, 50, 50);
		panel.add(number7);
		
		//Number 8
		JButton number8 = new JButton("8");
		number8.setBounds(50, 100, 50, 50);
		panel.add(number8);
		
		//Number 9
		JButton number9 = new JButton("9");
		number9.setBounds(100, 100, 50, 50);
		panel.add(number9);
	}
}
