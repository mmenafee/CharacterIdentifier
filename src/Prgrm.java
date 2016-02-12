package net.java.dev.designgridlayout;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*; 
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.awt.GraphicsEnvironment;
import java.awt.Font;

public class Prgrm {
	
	private JTextArea cpaste;
	private JLabel here;
	private JLabel hex;
	private JLabel utf8;
	private JTextField hext;
	private JTextField utf8t;
	private JFrame f;
	private JPanel top;
	private JPanel bot;
	private JScrollPane scroll;
	
	
	//constructor
	public Prgrm(){
		gui();
		
	}
	
	public void gui(){
		f = new JFrame("Character Identifier");
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		top = new JPanel();
				
		bot = new JPanel();
		
		here = new JLabel("Copy and paste character here!");
		here.setFont(new Font("DIN_CONDENSED", Font.PLAIN, 20));
		
		JTextArea cpaste = new JTextArea();
		scroll.add(cpaste);
		
		top.add(here);
		top.add(scroll);
		f.add(top);
		
	}

    public static void main(String[] args){
    	new Prgrm();
    }
}

