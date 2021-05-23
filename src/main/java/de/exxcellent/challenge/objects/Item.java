package de.exxcellent.challenge.objects;

public class Item {
	
	private int day,MxT,MnT;
	
	
	public Item(int day,int MxT, int MnT) {
		this.setDay(day);
		this.setMxT(MxT);
		this.setMnT(MnT);
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMnT() {
		return MnT;
	}


	public void setMnT(int mnT) {
		MnT = mnT;
	}


	public int getMxT() {
		return MxT;
	}


	public void setMxT(int mxT) {
		MxT = mxT;
	}
	
	
	public int getTemperatureSpread() {
		int spread = Math.abs(MxT - MnT);
		return spread;
	}
	
	

}
