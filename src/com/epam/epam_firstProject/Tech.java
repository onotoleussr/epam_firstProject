package com.epam.epam_firstProject;

public class Tech {

	private String name = "";
	private int power = 0;
	private String powerClass = "A";
	private boolean isOn = false;

	public void setPower(int p) {
		power = p;
	}
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public void setPowerClass(String pc) {
		powerClass = pc;
	}

	public String getPowerClass() {
		return powerClass;
	}

	public void setPowerOn() {
		isOn = true;
	}

	public void setPowerOff() {
		isOn = false;
	}

	public boolean getPowerStatus() {
		return isOn;
	}

	public class BigTech extends Tech {

	}

	public class SmallTech extends Tech {

	}

	public class TvAudioTech extends Tech {

	}

	public class CompTech extends Tech {

	}

}
