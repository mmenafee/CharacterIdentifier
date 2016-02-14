import java.io.File;
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
    JTextArea bigtext = new JTextArea("Your Character:", 7,14);
    static JTextField textArea1 = new JTextField("Unicode: ", 25);
    static JTextField textArea2 = new JTextField("Hexadecimal: ", 25);
    JTextField textArea3 = new JTextField("UTF-8: ", 25);
    static JTextField textfield1 = new JTextField(20); 
    JLabel label = new JLabel("Copy Your Character Here");
    JButton b1 = new JButton("Enter");
    JScrollPane scroll = new JScrollPane(bigtext); //place the JTextArea in a scroll pane
    
    FlowLayout flow = new FlowLayout();
    
    
    
    public Sam() { 
          frame.setVisible(true);
          frame.setSize(1200,250);
          frame.setLocation(100,200);
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
          textArea2.setLocation(400,0); 
          

          textArea3.setSize(25, 25);
          textArea3.setBorder(border);
          textArea3.setEditable(false);
          textArea3.setFont(new Font("Verdana", Font.BOLD, 12));
          textArea3.setLocation(200,25); 
          
          
          textfield1.setSize(25, 25);
          textfield1.setBorder(border);
          textfield1.setFont(new Font("Verdana", Font.BOLD, 12));
          textfield1.setLocation(200,25); 
          
          
          JPanel a = new JPanel();
          JPanel b = new JPanel();
          JPanel c = new JPanel();
          
          a.setSize(400,800);
          a.setBorder(border);
          a.setLayout(new FlowLayout());
          
          b.setBorder(border);
          b.setLocation(400,600);
          
          b.add(label);
          b.add(textfield1);
          b.add(b1);
          a.add(scroll);
          a.add(textArea1);
          a.add(textArea2);
          a.add(textArea3);
          
          
          frame.add(b);
          frame.add(a);
          
          b1.addActionListener(new ButtonListener());
    }
    
    class ButtonListener implements ActionListener{
    	 ButtonListener() {
    	  }

    	@Override
    	  public void actionPerformed(ActionEvent e) {
    	        // TODO Auto-generated method stub
    			String character = textfield1.getText();
    		
    	        bigtext.setText(textfield1.getText());
    	        bigtext.setFont(new Font("Verdana", Font.BOLD, 30));
    	        
    			int unicode = character.charAt(0);
    			String hex = Integer.toHexString(unicode);
    			textArea1.setText("Unicode:"+String.valueOf(unicode));
    			textArea2.setText("Hexacademical:"+hex);
    	    }
    	    
    }
    
	public static void main (String[] args) throws Exception {
		
		Scanner scan = null;
		try {
			scan = new Scanner(new File("entityfacts.csv"));
			
		} catch (IOException e){
			System.out.println("Could not load file");
		}
		//Scanner scan = new Scanner(new File("entityfacts.csv"));
		while (scan.hasNext()){
			System.out.println(scan.nextLine());
		}	
		
		Scanner user_input = new Scanner (System.in);

	

	}
	
}
