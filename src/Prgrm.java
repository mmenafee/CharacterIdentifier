//http://illegalargumentexception.blogspot.com/2009/05/java-rough-guide-to-character-encoding.html#javaencoding_encodings
//Markus Feng
//Phillip Chung
//Michael Meng
//Ryan Kola
//Kofi Adu
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.applet.Applet;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Sam extends Applet {

    JFrame frame = new JFrame("Character Identifier");
    static JTextArea bigtext = new JTextArea("Your Character:", 7,14);
    static JTextField textArea1 = new JTextField("Decimal: ", 25);
    static JTextField textArea2 = new JTextField("Hex: ", 25);
    static JTextField textArea3 = new JTextField("UTF-8: ", 25);
    static JTextField aentities = new JTextField("Alpha Entity",25);
    static JTextField hentities = new JTextField("Hex Entity",25);
    static JTextField dentities = new JTextField("Decimal Entity",25);
    static JTextField textfield1 = new JTextField(20); 
    static JTextField descrip = new JTextField("Character Description:",35);
    static JTextField javac = new JTextField("Java Char Literal:",25);
    static Border border = BorderFactory.createLineBorder(Color.BLACK);
    
    JLabel label = new JLabel("Copy Your Character Here");
    static JButton b1 = new JButton("Enter");
    JScrollPane scroll = new JScrollPane(bigtext); //place the JTextArea in a scroll pane
    
    FlowLayout flow = new FlowLayout();
    
    //constructor
    public Sam() { 
          frame.setVisible(true);
          frame.setSize(1200,400);
          frame.setLocation(100,200);
          frame.setResizable(false);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          frame.setLayout(new FlowLayout());
          
          label.setFont(new Font("Verdana", Font.BOLD, 12));
          
          bigtext.setLineWrap(true);
          bigtext.setFont(new Font("Verdana", Font.BOLD, 12));
          bigtext.setEditable(false);
                    
          editField(textArea1);
          editField(textArea2);
          editField(textArea3);
          editField(textfield1);
          textfield1.setEditable(true);
          editField(aentities);
          editField(hentities);
          editField(dentities);
          editField(descrip);
          editField(javac);
          
          JPanel a = new JPanel();
          JPanel b = new JPanel();
          JPanel c = new JPanel();
          JPanel d = new JPanel();
          JPanel e = new JPanel();
       
          
          a.setBorder(border);
          a.setLayout(flow);
          
          b.setBorder(border);
          b.setLayout(flow);
          
          c.setBorder(border);
          c.setLayout(flow);
          
          d.setBorder(border);
          d.setLayout(flow);
          
          e.setBorder(border);
          e.setLayout(flow);
          
          a.add(scroll);
          c.add(descrip);
          c.add(textArea1);
          c.add(textArea2);
          b.add(label);
          b.add(textfield1);
          b.add(b1);
          d.add(aentities);
          d.add(hentities);
          d.add(dentities);
          e.add(javac);
          e.add(textArea3);
          
        
          frame.add(b);
          frame.add(a);
          frame.add(c);
          frame.add(d);
          frame.add(e);
          
        b1.addActionListener(new ButtonListener());
    }
    //method for changing characteristics of jtextfields
    public void editField(JTextField tf){
    	
    	tf.setSize(25, 25);
        tf.setBorder(border);
        tf.setFont(new Font("Verdana", Font.BOLD, 12));
        tf.setLocation(200,25); 
        tf.setEditable(false);
        
    }
    
    class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			try
			{
				//because a new one is not always found
				
				descrip.setText("Character Description:");
				aentities.setText("Alpha Entity: ");
				
				unicode.fetch(textfield1.getText());
			}
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
    	
    }
    
}
