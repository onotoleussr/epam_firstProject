package com.epam.epam_firstProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class MenuControl {

	private ArrayList<String> menuItemsAL = new ArrayList<String>();
	private String menuValuesStr = new String();

	public MenuControl() {

		setMenuItems();
		setMenuValuesStr();

	}

	public void showMenu() {

		System.out.println("::МЕНЮ::");

		showMenuItems();

	}

	private void setMenuItems() {

		if (!menuItemsAL.isEmpty()) {
			menuItemsAL.clear();
		}

		menuItemsAL.add("Для окончания работы введите: 0");
		menuItemsAL
				.add("Для включения некоторых приборво и расчета потребляемой мощности введите: 1");
		menuItemsAL
				.add("Для сортировки по классу потребления мощьности введите: 2");
		menuItemsAL.add("Для сортировки по потребляемой мощьности введите: 3");
		menuItemsAL.add("Для отбора по потребляемой мощьности введите: 4");

	}

	private void setMenuValuesStr() {

		menuValuesStr = "";
		for (Integer i = 1; i < menuItemsAL.size(); i++) {
			menuValuesStr = menuValuesStr.concat(i.toString()).concat(",");
		}
		menuValuesStr = menuValuesStr.concat("0");

	}

	private void showMenuItems() {

		if (!menuItemsAL.isEmpty()) {

			for (int i = 1; i < menuItemsAL.size(); i++) {
				System.out.println(menuItemsAL.get(i));
			}
			System.out.println(menuItemsAL.get(0));
		}

	}

	public String getmenuValuesStr() {

		return menuValuesStr;

	}

}
