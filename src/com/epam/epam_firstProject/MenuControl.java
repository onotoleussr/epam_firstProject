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

		System.out.println("::����::");

		showMenuItems();

	}

	private void setMenuItems() {

		if (!menuItemsAL.isEmpty()) {
			menuItemsAL.clear();
		}

		menuItemsAL.add("��� ��������� ������ �������: 0");
		menuItemsAL
				.add("��� ��������� ��������� �������� � ������� ������������ �������� �������: 1");
		menuItemsAL
				.add("��� ���������� �� ������ ����������� ��������� �������: 2");
		menuItemsAL.add("��� ���������� �� ������������ ��������� �������: 3");
		menuItemsAL.add("��� ������ �� ������������ ��������� �������: 4");

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
