package game_class_separate;

import java.util.Random;
import java.util.Scanner;

// 스탯 결정 메서드
public class Stat_dice {
	public int stat_dice(Player_Status ps) {
		Random rdm = new Random(); // math.random 이 아닌 java.util 에 있는 random 함수 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마지막으로 " + ps.getP_name() + " 님의 능력치를 정하겠습니다.");
		System.out.println("10면체 주사위 두개를 굴립니다. 두개의 합에 따라 능력이 정해집니다.");
		System.out.println("-------------------------------------------------------");

		int dice_10_1 = rdm.nextInt(10); // 첫번째 10면체 주사위
		int dice_10_2 = rdm.nextInt(10); // 두번째 10면체 주사위
		int dice_10_sum = dice_10_1 + dice_10_2; // 10면체 주사위들의 합
		
		int p_hp, p_str, p_dex;

		System.out.println("첫번째 주사위는 " + dice_10_1);
		System.out.println("두번째 주사위는 " + dice_10_2);

		if (dice_10_sum >= 15) {
			// 각 직업 기본 능력치 그대로
		} else if (dice_10_sum >= 8 && dice_10_sum < 15) { // 능력치 10% 저하
			p_hp = ps.getP_hp() - ((ps.getP_hp() * 10) / 100);
			ps.setP_hp(p_hp);
			p_str = ps.getP_str() - ((ps.getP_str() * 10) / 100);
			ps.setP_str(p_str);
			p_dex = ps.getP_dex() - ((ps.getP_dex() * 10) / 100);
			ps.setP_dex(p_dex);
		} else if (dice_10_sum < 8) { // 능력치 20% 저하
			p_hp = ps.getP_hp() - ((ps.getP_hp() * 20) / 100);
			ps.setP_hp(p_hp);
			p_str = ps.getP_str() - ((ps.getP_str() * 20) / 100);
			ps.setP_str(p_str);
			p_dex = ps.getP_dex() - ((ps.getP_dex() * 20) / 100);
			ps.setP_dex(p_dex);
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf(ps.getP_name() + " 님 당신의 능력치 입니다. \n" + "체력 : " + ps.getP_hp() + " \n" + "힘 : " + ps.getP_str() + " \n"
				+ "민첩 : " + ps.getP_dex() + " \n" + "무기 :" + ps.getP_weapon() + " \n");
		System.out.println("-------------------------------------------------------");
		// class 분리
		System.out.println(ps.getP_name() + " 님 이대로 진행하시겠습니까? (1. YES   2. NO)");
		System.out.println("-------------------------------------------------------");

		int character_set_flag = sc.nextInt();
		return character_set_flag;
		
		
	}
}
