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

	public ArrayList<String> getPropertiesFileList(){
		return filesList;
	}
	
	private void FillProperties() {

		String propertiesFileName = new String();

		for (int i = 0; i < filesList.size(); i++) {

			try {

				propertiesFileName = filesList.get(i).toString();
				ous = new FileOutputStream(propertiesFileName);

				if (propertiesFileName.equals("tv.properties")) {

					prop.setProperty("techClass", "TvAudioTech");
					prop.setProperty("name", "TV");
					prop.setProperty("power", "75");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("refrigerator.properties")) {

					prop.setProperty("techClass", "BigTech");
					prop.setProperty("name", "Refrigerator");
					prop.setProperty("power", "145");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("microwave.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Microwave");
					prop.setProperty("power", "1200");
					prop.setProperty("powerClass", "C");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("computer.properties")) {

					prop.setProperty("techClass", "CompTech");
					prop.setProperty("name", "Computer");
					prop.setProperty("power", "100");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("notebook.properties")) {

					prop.setProperty("techClass", "CompTech");
					prop.setProperty("name", "Notebook");
					prop.setProperty("power", "80");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("iron.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Iron");
					prop.setProperty("power", "990");
					prop.setProperty("powerClass", "C");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("hairdryer.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Hairdryer");
					prop.setProperty("power", "1800");
					prop.setProperty("powerClass", "D");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("kettle.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Kettle");
					prop.setProperty("power", "2000");
					prop.setProperty("powerClass", "D");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("toster.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Toster");
					prop.setProperty("power", "800");
					prop.setProperty("powerClass", "C");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("mixer.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Mixer");
					prop.setProperty("power", "195");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("mincer.properties")) {

					prop.setProperty("techClass", "SmallTech");
					prop.setProperty("name", "Mincer");
					prop.setProperty("power", "600");
					prop.setProperty("powerClass", "B");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("dvd.properties")) {

					prop.setProperty("techClass", "TvAudioTech");
					prop.setProperty("name", "DVD");
					prop.setProperty("power", "35");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("gameConsol.properties")) {

					prop.setProperty("techClass", "TvAudioTech");
					prop.setProperty("name", "Game consol");
					prop.setProperty("power", "25");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("audioSystem.properties")) {

					prop.setProperty("techClass", "TvAudioTech");
					prop.setProperty("name", "Audio system");
					prop.setProperty("power", "100");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("conditioner.properties")) {

					prop.setProperty("techClass", "BigTech");
					prop.setProperty("name", "Conditioner");
					prop.setProperty("power", "700");
					prop.setProperty("powerClass", "B");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("washingMachine.properties")) {

					prop.setProperty("techClass", "BigTech");
					prop.setProperty("name", "Washing machine");
					prop.setProperty("power", "650");
					prop.setProperty("powerClass", "B");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("dishwasher.properties")) {

					prop.setProperty("techClass", "BigTech");
					prop.setProperty("name", "Dishwasher");
					prop.setProperty("power", "100");
					prop.setProperty("powerClass", "A");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}
				if (propertiesFileName.equals("cooker.properties")) {

					prop.setProperty("techClass", "BigTech");
					prop.setProperty("name", "Cooker");
					prop.setProperty("power", "3500");
					prop.setProperty("powerClass", "D");
					prop.setProperty("powerOn", "false");
					prop.store(ous, null);

				}

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

	public void setProperties() {

		SetList();
		FillProperties();

	}

	public ArrayList<Tech> getTech() {

		Properties locProp;
		ArrayList<Tech> techArr = new ArrayList<Tech>();
		if (!techArr.isEmpty()) {
			techArr.clear();
		}

		for (int i = 0; i < filesList.size(); i++) {

			locProp = new Properties();

			locProp = GetProperties(filesList.get(i));

			if(locProp.getProperty("techClass").equals("BigTech")){
				
			}else if(locProp.getProperty("techClass").equals("SmallTech")){
			
			}else if(locProp.getProperty("techClass").equals("TvAudioTech")){
			
			}else {
				
			}
				
			Tech techObj = new Tech();
			
			
			techObj.setName(locProp.getProperty("name"));
			techObj.setPower(Integer.parseInt(locProp.getProperty("power")));
			techObj.setPowerClass(locProp.getProperty("powerClass"));

			if (locProp.getProperty("powerOn").equals("true")) {
				techObj.setPowerOn();
			} else {
				techObj.setPowerOff();
			}

			techArr.add(techObj);

		}

		return techArr;

	}	
	
	public Properties GetProperties(String s) {

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
