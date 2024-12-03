//Use card, grid, gridbag, and spring layout.
package JavaGUI;

import javax.swing.*;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;

public class GridLayoutExample extends JFrame{
	public GridLayoutExample() {
		this.setLayout(new GridLayout());
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.YELLOW);
		this.setVisible(true);
		
		JButton submit=new JButton("SUBMIT");
		submit.setBackground(Color.cyan);
		JButton login=new JButton("LOGIN");
		login.setBackground(Color.gray);
		JButton signup=new JButton("SIGN-UP");
		signup.setBackground(Color.green);
		JButton exit=new JButton("Exit");
		exit.setBackground(Color.blue);
		
		this.add(submit); this.add(login); this.add(signup); this.add(exit);
	}
	public static void main(String[] args) {
		GridLayoutExample obj=new GridLayoutExample();
		
	}
}
