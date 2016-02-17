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
		
		
		
		 BufferedReader br = new BufferedReader(new FileReader("entityfacts.csv"));
		    String line = null;
	    
	    Scanner user_input = new Scanner (Sam.textfield1.getText());
		String character = user_input.next();
		
		
		System.out.println(character);
		int characterhex = character.charAt(0);
		Integer.toHexString(characterhex);
		String hexadec = "0x00" + Integer.toHexString(characterhex);
		
		
		
		
	    while ((line = br.readLine()) != null) {
	      // System.out.println(line);
	      final String[] values = line.split(",");
	      
	    
	      if (values.length > 2){
	    	  values[1] = values[1].replaceAll("\\s","");
	    	  //System.out.println(values[1]);
	      	if(hexadec.equals(values[1]))
	      	{
	      		values[4] = values[4].replaceAll("\\s",""); 
	      		System.out.println(values[4]);
	      		Sam.descrip.setText("Character Desciption" + values[4]);
	      		values[3] = values[3].replaceAll("\\s",""); 
	      		System.out.println(values[3]);
	      		Sam.aentities.setText("Alpha Entity:" + values[3]);
	      		
	      	}
	      	
	      }
	
			
    			Sam.bigtext.setText(Sam.textfield1.getText());
	    	    Sam.bigtext.setFont(new Font("Verdana", Font.BOLD, 30));
	    	        
    			int unicode = character.charAt(0);
    			String hex = Integer.toHexString(unicode);
    			Sam.textArea1.setText("Decimal:" + String.valueOf(unicode));
    			Sam.textArea2.setText("Hex:" + hexadec);
    			Sam.dentities.setText("Decimal Entity: &#" +  String.valueOf(unicode));
    			Sam.hentities.setText("Hex Entity: &#"+ hexadec);
    			Sam.javac.setText("Java Encoding: "+unicode);
    			
   		}
     
	    }

	      
	    
    }
    
    
	
	

	

	    
