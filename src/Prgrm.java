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
    static JTextField descrip = new JTextField("Character Description:",25);
    static JTextField javac = new JTextField("Java Code:",25);
    
    JLabel label = new JLabel("Copy Your Character Here");
    static JButton b1 = new JButton("Enter");
    JScrollPane scroll = new JScrollPane(bigtext); //place the JTextArea in a scroll pane
    
    FlowLayout flow = new FlowLayout();
    
    public Sam() { 
          frame.setVisible(true);
          frame.setSize(1200,400);
          frame.setLocation(100,200);
          frame.setResizable(false);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          frame.setLayout(new FlowLayout());
    
          Border border = BorderFactory.createLineBorder(Color.BLACK);
          
          label.setFont(new Font("Verdana", Font.BOLD, 12));
          
          bigtext.setLineWrap(true);
          bigtext.setFont(new Font("Verdana", Font.BOLD, 12));
          bigtext.setEditable(false);
          
          textArea1.setSize(25, 25);
          textArea1.setBorder(border);
          textArea1.setEditable(false);
          textArea1.setFont(new Font("Verdana", Font.BOLD, 12));
          textArea1.setLocation(200,25); 
         
          textArea2.setSize(25, 25);
          textArea2.setBorder(border);
          textArea2.setEditable(false);
          textArea2.setFont(new Font("Verdana", Font.BOLD, 12));
          textArea2.setLocation(200,25); 
          

          textArea3.setSize(25, 25);
          textArea3.setBorder(border);
          textArea3.setEditable(false);
          textArea3.setFont(new Font("Verdana", Font.BOLD, 12));
          textArea3.setLocation(200,25); 

      
          textfield1.setSize(25, 25);
          textfield1.setBorder(border);
          textfield1.setFont(new Font("Verdana", Font.BOLD, 12));
          textfield1.setLocation(200,25); 
          
          aentities.setSize(25, 25);
          aentities.setBorder(border);
          aentities.setFont(new Font("Verdana", Font.BOLD, 12));
          aentities.setLocation(200,25); 
          
          hentities.setSize(25, 25);
          hentities.setBorder(border);
          hentities.setFont(new Font("Verdana", Font.BOLD, 12));
          hentities.setLocation(200,25); 
          
          dentities.setSize(25, 25);
          dentities.setBorder(border);
          dentities.setFont(new Font("Verdana", Font.BOLD, 12));
          dentities.setLocation(200,25); 
          
          descrip.setSize(25, 25);
          descrip.setBorder(border);
          descrip.setFont(new Font("Verdana", Font.BOLD, 12));
          descrip.setLocation(200,25); 
          
          javac.setSize(25, 25);
          javac.setBorder(border);
          javac.setFont(new Font("Verdana", Font.BOLD, 12));
          javac.setLocation(200,25); 
          
          JPanel a = new JPanel();
          JPanel b = new JPanel();
          JPanel c = new JPanel();
          JPanel d = new JPanel();
          JPanel e = new JPanel();
       
          
          a.setBorder(border);
          a.setLayout(new FlowLayout());
          
          b.setBorder(border);
          b.setLayout(new FlowLayout());
          
          c.setBorder(border);
          c.setLayout(new FlowLayout());
          
          d.setBorder(border);
          d.setLayout(new FlowLayout());
          
          e.setBorder(border);
          e.setLayout(new FlowLayout());
          
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
    
    class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			try
			{
				unicode.fetch();
			}
			catch (Exception e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
    	
    }
    
  
   
	public static void main (String[] args) {
		
		

	}
	
}
