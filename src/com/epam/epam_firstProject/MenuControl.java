package com.epam.epam_firstProject;

import java.util.Scanner;
import java.io.Console;

public class MenuControl {

	private int selectedMenuItem = 0;
	
	public void showMenu(){
		
		System.out.println("::����::");
		
		System.out.println("��� ��������� ��������� �������� � ������� ������������ �������� �������: 1");
		System.out.println("��� ���������� �� ������ ����������� ��������� �������: 2");
		System.out.println("��� ���������� �� ������������ ��������� �������: 3");
		System.out.println("��� ������ �� ������������ ��������� �������: 4\n\n");
		
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
