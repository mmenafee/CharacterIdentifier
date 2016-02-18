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
    
	
	public static void fetch(String character) throws Exception {
		
		 	BufferedReader br = new BufferedReader(new FileReader("entityfacts.csv"));
		    String line = null;
		    
			int dec = character.charAt(0);
			String hex = Integer.toHexString(dec);
			String one = ("000" + hex).substring(hex.length());
			String hexadec = "0x" + one;
			String javaen = "\\u" + one;
			
			//code for getting utf-8
			// http://illegalargumentexception.blogspot.com/2009/05/java-rough-guide-to-character-encoding.html#javaencoding_encodings
			 byte[] encoded = javaen.getBytes("UTF-8");
		      for (byte b : encoded) {
		    	  Sam.textArea3.setText("UTF-8:"+ b);
		      }
		      
		    while ((line = br.readLine()) != null) {
		   
		      String[] values = line.split(",");
		      
		    
		      if (values.length > 2){
		    	  values[1] = values[1].replaceAll("\\s","");
		    	 
		      	if(hexadec.equals(values[1]))
		      	{
		      		
		      		values[4] = values[4].replaceAll("\\s",""); 
		      		Sam.descrip.setText("Character Description:" + values[4]);
		      		
		      		values[3] = values[3].replaceAll("\\s",""); 
		      		Sam.aentities.setText("Alpha Entity:&" + values[3]);
		    	  }
		    	  }
	
				
    			Sam.bigtext.setText(Sam.textfield1.getText());
	    	    Sam.bigtext.setFont(new Font("Verdana", Font.BOLD, 30));
	    	       	
    			Sam.textArea1.setText("Decimal: " + String.valueOf(dec));
    			Sam.textArea2.setText("Hex: " + hexadec);
    			Sam.dentities.setText("Decimal Entity: &#" + String.valueOf(dec));
    			Sam.hentities.setText("Hex Entity: &#x" + one);
    			Sam.javac.setText("Java Char Literal: \\u" + one );
    			
    			
    			
   		}
     
	    }

	      
	    
    }
    
    
	
	

	

	    
