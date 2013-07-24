package com.epam.epam_firstProject;

import java.util.ArrayList;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class PropertiesContol {
	
	private ArrayList<String> filesList = new ArrayList<String>();
	private Properties prop = new Properties();
	
	private FileInputStream ins;
	private FileOutputStream ous;
		
	private void SetList() {
		if (!filesList.isEmpty())
			filesList.clear();

		filesList.add("tv.properties");
		filesList.add("refrigerator.properties");
		filesList.add("microwave.properties");
		filesList.add("computer.properties");
		filesList.add("notebook.properties");
		filesList.add("iron.properties");
		filesList.add("hairdryer.properties");
		filesList.add("kettle.properties");
		filesList.add("toster.properties");
		filesList.add("steamer.properties");
		filesList.add("mixer.properties");
		filesList.add("mincer.properties");
		filesList.add("dvd.properties");
		filesList.add("gameConsol.properties");
		filesList.add("audioSystem.properties");
		filesList.add("conditioner.properties");
		filesList.add("washingMachine.properties");
		filesList.add("dishwasher.properties");
		filesList.add("cooker.properties");

	}

	private void FillProperties() {

		for (int i = 0; i < filesList.size(); i++) {

			try {
				
				if(filesList.get(i).toString().equals("tv.properties")){
				
					ous = new FileOutputStream(filesList.get(i).toString());
					
					prop.setProperty("power", "100");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous,	null);
					
				}
				

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}
	
	public void setProperties(){
		
		SetList();
		FillProperties();
		
	}
	
	public Properties GetProperties(String s){
		
		try {

			ins = new FileInputStream(s.toString());
			prop.load(ins);

			return prop;
		}

		catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}

		catch (IOException e) {
			System.out.println("IO Error!");
			e.printStackTrace();
		}
	
		return null;
		
	}

	
	
	
	
	

}
