package day_1;

import java.util.*;
import java.util.Scanner;

public class Game_C {

	public static void main(String[] args) {
//		// 클래스 호출
//		p_Status player = new p_Status();
//		// 유저 생성 메서드 호출
//		player.player_make();
		
		monster m_Data = new monster();
		
		String monsters = m_Data.getM_name();
		System.out.println(monsters);
		
		
	}

//	public static monster Call_mons() {
//		
//		p_Status p_Status = new p_Status(); // 캐릭터생성 생성자
//		monster monster = new monster();
//		Random rnd = new Random();
//		
//		boolean character_set = true; // 플레이어 생성 진행 여뷰
//		int character_set_flag = 0; // 플레이어 생성 진행 flag
//		boolean tour = true; // 휴식 여부
//		int tour_flag = 0;
//		boolean monster_attack = true; // 전투 진행 여부
//		int monster_attack_flag = 0; // 전투 진행 flag
//		int dice_encounter = 8; // 몬스터 조우 확률 주사위
//		
//		String name = p_Status.getP_name();
//		
//		int monster_kind_dice = rnd.nextInt(5)+1; //몬스터의 종류 다이스
//		
//		while (tour) {
//			Scanner sm = new Scanner(System.in); // 몬스터 전투 시 새로운 스캐너 호출
//			int monster_encounter = 0; // 몬스터와 조우
//			int monster_kind = 0; // 몬스터의 종
//			
//			System.out.printf(
//					name + " 님은 모험의 여행을 떠났습니다. \n" + " 1 을 선택하시면, 계속 앞으로 나아갑니다." + " 2 를 선택하시면, 휴식을 취합니다.");
//			
//			tour_flag = sm.nextInt();
//			
//			switch (tour_flag) {
//			case 1:
//				System.out.println("----------------------------------------------------------");
//				System.out.println(name + " 님 기척이 느껴집니다. (주사위를 굴립니다.)");
//				monster_encounter = rnd.nextInt(dice_encounter); // 주사위를 굴려 몬스터 조우 확률을 정함
//				System.out.println(monster_encounter + "  나왔습니다.");
//				if (monster_encounter > 4) {
//					System.out.println("-----------------------------------------------------");
//					System.out.println("아무 것도 없습니다. 계속 여행을 떠납니다.");
//				} else if (monster_encounter <= 4) {
//					System.out.println("-----------------------------------------------------");
//					System.out.printf("몬스터가 있는 것 같습니다. \n" + "주사위를 굴립니다. \n");
//					
//					monster_kind = rnd.nextInt(monster_kind_dice); // 주사위를 굴려 몬스터 종류를 정
//					
//					/* 몬스터 종류 설정 */
//					switch (monster_kind_dice) {
//					case 1:
//						if()
//						monster.getM_name();
//						break;
//						
//					case 2:
//						monster.getM_name();
//						break;
//						
//					case 3:
//						monster_name = "Ork leader"; // 몬스터 이름
//						monster_HP = 200; // 몬스터 체력
//						m_weapon_name = "Mace"; // 몬스터 무기명
//						m_weapon_dice = 8; // 몬스터 공격력 주사위
//						monster_str = 15; // 몬스터 힘
//						monster_dex = 9; // 몬스터 민첩성
//						monster_level = 3; // 몬스터 레벨
//						break;
//						
//					case 4:
//						monster_name = "Ogre"; // 몬스터 이름
//						monster_HP = 300; // 몬스터 체력
//						m_weapon_name = "Stick"; // 몬스터 무기명
//						m_weapon_dice = 6; // 몬스터 공격력 주사위
//						monster_str = 18; // 몬스터 힘
//						monster_dex = 10; // 몬스터 민첩성
//						monster_level = 4; // 몬스터 레벨
//						break;
//						
//					case 5:
//						monster_name = "Fallen knight"; // 몬스터 이름
//						monster_HP = 200; // 몬스터 체력
//						m_weapon_name = "Bastard Sword"; // 몬스터 무기명
//						m_weapon_dice = 8; // 몬스터 공격력 주사위
//						monster_str = 18; // 몬스터 힘
//						monster_dex = 12; // 몬스터 민첩성
//						monster_level = 5; // 몬스터 레벨
//						break;
//	}
//
//	}
		
					
}

