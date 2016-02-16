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

public class unicode {
    
	
	public static void fetch() throws Exception {
		
		System.out.println("method ran");
		
	    BufferedReader br = new BufferedReader(new FileReader("entityfacts.csv"));
	    String line = null;
	    
	    Scanner user_input = new Scanner (System.in);
		String character;
		character = user_input.next();
		System.out.println(character);
		int characterhex = character.charAt(0);
		Integer.toHexString(characterhex);
		final String hexadec = "0x00" + Integer.toHexString(characterhex);
		//int number = Integer.parseInt(characterhexadecimal);
		System.out.println(characterhex);
		System.out.println(hexadec);
		
	    while ((line = br.readLine()) != null) {
	      // System.out.println(line);
	      final String[] values = line.split(",");
	      
	    
	      if (values.length > 2){
	    	  values[1] = values[1].replaceAll("\\s","");
	    	  //System.out.println(values[1]);
	      	if(hexadec.equals(values[1]))
	      	{
	      		System.out.println("Found Descirption");
	      		values[4] = values[4].replaceAll("\\s",""); 
	      		System.out.println(values[4]);
	      		System.out.println("Found Alpha Entity");
	      		values[3] = values[3].replaceAll("\\s",""); 
	      		System.out.println(values[3]);
	      		
	      	}
	      	
	      }
	
				String character1 = Sam.textfield1.getText();
    			Sam.bigtext.setText(Sam.textfield1.getText());
	    	    Sam.bigtext.setFont(new Font("Verdana", Font.BOLD, 30));
	    	        
    			int unicode = character1.charAt(0);
    			String hex = Integer.toHexString(unicode);
    			Sam.textArea1.setText("Decimal: "+ String.valueOf(unicode));
    			Sam.textArea2.setText(hexadec);
    			Sam.aentities.setText(values[3]);
    			Sam.descrip.setText(values[4]);
   		}
     
	    }

	      
	    
    }
    
    
	
	

	

	    
