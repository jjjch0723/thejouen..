package day_1;

public class Status {
	private int str;
	private int dex;
	private int hel;
	private int mp;

	public Status() {
	}

	public Status(int str, int dex, int hel, int mp) {
		this.str = str;
		this.dex = dex;
		this.hel = hel;
		this.mp = mp;
	}
	
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getHel() {
		return hel;
	}
	public void setHel(int hel) {
		this.hel = hel;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
}
