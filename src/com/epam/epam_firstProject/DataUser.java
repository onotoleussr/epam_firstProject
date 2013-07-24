package com.epam.epam_firstProject;

import java.util.ArrayList;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class DataUser {

	private ArrayList<String> filesList = new ArrayList<String>();

	public void SetList() {
		if (!filesList.isEmpty())
			filesList.clear();

		filesList.add("tv.properties");
		filesList.add("refrigerator.properties");
		filesList.add("microwave.properties");
		filesList.add("washing_machine.properties");
		filesList.add("computer.properties");
		filesList.add("iron.properties");

	}

	public void FillProperties() {

		for (int i = 0; i < filesList.size(); i++) {

			Properties prop = new Properties();

			try {

				prop.setProperty("power", "100");
				prop.setProperty("powerOn", "true");
				prop.store(new FileOutputStream(filesList.get(i).toString()),
						null);

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

	public Properties GetProperties(String s){
		
		Properties prop = new Properties();

		FileInputStream ins;
		
		try {

			ins = new FileInputStream(s.toString());
			prop.load(ins);

			return prop;
			
//			System.out.println(prop.toString());

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

	public void test() {

		for (int i = 0; i < filesList.size(); i++) {

			try {

				Properties prop = new Properties();

				FileInputStream ins = new FileInputStream(filesList.get(i)
						.toString());

				prop.load(ins);

				System.out.println(prop.toString());

			}

			catch (FileNotFoundException e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}

			catch (IOException e) {
				System.out.println("IO Error!");
				e.printStackTrace();
			}

		}

	}

}
