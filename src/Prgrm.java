
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.w3c.dom.Document;

import java.awt.*; 
import java.awt.event.*;

import java.awt.Font;

public class Prgrm {
	
	private JFrame f;
	private JTextField cpaste;
	private JLabel here;
	private JLabel hex;
	private JLabel utf8;
	private JTextField hext;
	private JTextField utf8t;
	private JPanel top;
	private JScrollPane scroll;
	private JLabel big;
	
	
	
	//constructor
	public Prgrm(){
		gui();
	}
	
	public void gui(){
		f = new JFrame("Character Identifier");
		f.setVisible(true);
		f.setSize(700,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		top = new JPanel();
		JScrollPane scroll = new JScrollPane();
				
		here = new JLabel("Copy and paste character here!");
		here.setFont(new Font("DIN_CONDENSED", Font.PLAIN, 20));
		
		big = new JLabel();
		
		final JTextField cpaste = new JTextField(35);
		
		final JLabel big = new JLabel();
		
		
		final String swag;
		
	    cpaste.addActionListener( 
	    		   new ActionListener() { 
	    		     public void actionPerformed(ActionEvent e) { 
	    		    	 swag = cpaste.getText();
	    		    	 big.setText(swag);
	    		     }
	    		      });
	    		   
		
		top.add(here);
		top.add(cpaste);
		top.add(big);
		f.add(top);
	}

    public static void main(String[] args){
    	new Prgrm();
    }
}

