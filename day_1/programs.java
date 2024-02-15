package day_1;

import java.util.Random;

public class programs {

	public static void main(String[] args) {
		
		Status st = cal_make();
		
		System.out.println("힘은 : " + st.getStr());
		System.out.println("체력은 : " + st.getHel());

	}
	
	public static Status cal_make () {
		 Random rd = new Random();
		 int dice8 = 8;
		 int str = rd.nextInt(dice8)+1; 
		 int dex = rd.nextInt(dice8)+1; 
		 int hel = rd.nextInt(dice8)+1; 
		 int mp = rd.nextInt(dice8)+1; 
		 
		 Status st = new Status(str, dex, hel, mp);
		return st;
	}
}
