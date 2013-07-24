package com.epam.epam_firstProject;

import java.util.Scanner;
import java.io.Console;

public class MenuControl {

	private int selectedMenuItem = 0;
	
	public void showMenu(){
		
		System.out.println("::МЕНЮ::");
		
		System.out.println("Для включения некоторых приборво и расчета потребляемой мощности введите: 1");
		System.out.println("Для сортировки по классу потребления мощьности введите: 2");
		System.out.println("Для сортировки по потребляемой мощьности введите: 3");
		System.out.println("Для отбора по потребляемой мощьности введите: 4\n\n");
		
		selectedMenuItem = getIntFromKeybord("[1,2,3,4]: ");
		
//		ClearConsole();
		
		System.out.println(selectedMenuItem);
		
	}
	
	private int getIntFromKeybord(String outText){
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(outText.toString());
		
		num = (int) sc.nextInt();
		
		return num;
	}
	
//	public void ClearConsole() {
//
//		System.console().flush();
//
//	}	
	
}
