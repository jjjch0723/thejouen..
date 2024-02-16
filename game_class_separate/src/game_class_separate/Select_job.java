package game_class_separate;

import java.util.Scanner;

//직업선택 매세드
public class Select_job {
		
	public void select_job(Player_Status ps) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ps.getP_name() + " 님 직업을 선택해주세요.");
		System.out.println("1. 전사		2. 마법사		3. 사냥꾼");
		int job_num = sc.nextInt();
		ps.setP_job(job_num);
		System.out.println("---------------------------------------------");
		
	}
	
}
