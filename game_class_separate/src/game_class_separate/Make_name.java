package game_class_separate;

import java.util.Scanner;

// 캐릭터 이름 생성 메서드
public class Make_name {
	
	public void p_name_make(Player_Status ps){
		Scanner sc = new Scanner(System.in);
		
		// p_Status_getset p = new p_Status_getset();
		System.out.println("당신의 이름을 입력하세요.");
		ps.setP_name(sc.nextLine());
		System.out.println("---------------------------------------------");
		System.out.println(ps.getP_name());
		//System.out.println(ps.getP_name() + " 님 직업을 선택해주세요.");	
	}
}
