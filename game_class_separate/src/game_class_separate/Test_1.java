package game_class_separate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		boolean run = true;
		int cur = 0;
		
		while(run) {
			System.out.println((cur+1) + "번째 숫자 입력");
			int num = sc.nextInt();
			
			list.add(num);
			cur++;
			System.out.println("계속 하시겠습니까? Y or N");
			String str = sc.nextLine();
			if(str == "Y") {
				run = false;
			}
			
		}
		
		
	}
		
		 
}
