package com.epam.epam_firstProject;

public class ProgramRunner {

	public static void main(String[] args) {
	
		PropertiesContol propCont = new PropertiesContol();
		MenuControl mc = new MenuControl();

		propCont.setProperties();
		mc.showMenu();
		
	}
}
