package Lottery;

import java.util.Random;
import java.util.Scanner;

public class Program {

	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Random rd = new Random();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("로또 프로그램을 실행합니다");
	        System.out.println("몇 번 실행하시겠습니까?");
	        int count = sc.nextInt();
	        for (int i = 0; i < count; i++) {
	            for (int j = 0; j < 7; j++) {
	                System.out.print((rd.nextInt(45)+1)+". ");

	            }
	            

	            System.out.println();
	        }
	    }
	   

}
