package com.epam.epam_firstProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Programm {

	private int selectedMenuItem = 0;
	private String menuValuesStr = "";
	private PropertiesContol propControl = new PropertiesContol();
	private ArrayList<String> propFileList = new ArrayList<String>();
	private ArrayList<Tech> techArr = new ArrayList<Tech>(); 
	
	MenuControl menu;

	public Programm() {
		menu = new MenuControl();
		menuValuesStr = menu.getmenuValuesStr();
		menu.showMenu();
	}

	public void beginProgramm() {

		propControl.setProperties();
		
		techArr = propControl.getTech();
		
		System.out.println("\n"+techArr.get(0).getClass());
		System.out.println(techArr.get(0).getName());
		System.out.println(techArr.get(0).getPower());
		System.out.println(techArr.get(0).getPowerClass());
		System.out.println(techArr.get(0).getPowerStatus());
		
		waitInput();

	}

	private void waitInput() {

		selectedMenuItem = getIntFromKeybord("[" + menuValuesStr + "]: ");

		System.out.println(selectedMenuItem);

	}

	private int getIntFromKeybord(String outText) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print(outText.toString());

		num = (int) sc.nextInt();

		return num;
	}

}
