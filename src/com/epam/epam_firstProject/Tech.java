package com.epam.epam_firstProject;

public abstract class Tech {

	private int power = 0;
	private String powerClass = "A";
	private boolean isOn = false;

	public void setPower(int p) {
		power = p;
	}	
	public void setPowerClass(String pc) {
		powerClass = pc;
	}	
	
	public void setPowerOn() {
		isOn = true;
	}	
	public void setPowerOff() {
		isOn = false;
	}	
	
		
	public class BigTech extends Tech {

	}

	public class SmallTech extends Tech {

	}

	public class TvAudioTech extends Tech {

	}

	public void CompTech() {

	}

}
