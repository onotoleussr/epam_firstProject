package com.epam.epam_firstProject;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramRunner {

	public static void main(String[] args) {
	

/*	Properties testProp = new Properties();
	testProp.put("first", 1);
	testProp.put("second", 2);
	testProp.put("third", 3);
*/	
	
	
	
  	Properties prop = new Properties();
  	 
	try {
		//set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "mkyong");
		prop.setProperty("dbpassword", "password");

		//save properties to project root folder
		prop.store(new FileOutputStream("test.properties"), null);

	} catch (IOException ex) {
		ex.printStackTrace();
    }

	
	
	
	
	
	
	
	
	//testProp.save("test.properties", "111");
	
	/*System.out.println(testProp);
		
	try
	{
	  os = new FileOutputStream("prop.txt");
	         
	  prop.save(os, "My properties");
	  os.close();
	}
	catch(Exception ex)
	{
	  System.out.println(ex.toString()); 
	}	
		
*/		
	}
}
