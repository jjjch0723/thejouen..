package game;
import java.util.*;

public class game_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean character_set = true;
		boolean start_Game = true;
		boolean tour = true; // 휴식 여부
		int tour_flag = 0;
		int dice_encounter = 8; // 몬스터 조우 확률 주사위
		int dice_kind = 5; // 몬스터 종류 주사위
		int battle = 0;
		int character_set_flag = 0; // 플레이어 생성 진행 flag
		
		Random rdm = new Random();
		
		p_Status pS = new p_Status(); // 게임이 로그라이크라는 가정 하에 while문 밖에 배치
		p_Status_getset pS_getset = new p_Status_getset();
		monster_getset m_getset = new monster_getset();
		
		while(start_Game) {
			while(character_set) {
				if (pS.player_make() == 1) {
					character_set = false;
					break;
				}
				else {
					System.out.println("---------------------------------------------");
				}
			} // character set while문 끝
			// System.out.println("끝났니?");
			while(tour) {
				int monster_encounter = 0; // 몬스터와 조우
				int monster_kind = 0; // 몬스터의 종
				
				monster m = new monster();
				Scanner sc = new Scanner(System.in);
				
				System.out.printf(
						pS_getset.getP_name() + " 님은 모험의 여행을 떠났습니다. \n" + " 1 을 선택하시면, 계속 앞으로 나아갑니다." + " 2 를 선택하시면, 휴식을 취합니다.");

				tour_flag = sc.nextInt();


				
				switch (tour_flag) {
					case 1:
						System.out.println("----------------------------------------------------------");
						System.out.println(pS_getset.getP_name() + " 님 기척이 느껴집니다. (주사위를 굴립니다.)");
						monster_encounter = rdm.nextInt(dice_encounter); // 주사위를 굴려 몬스터 조우 확률을 정함
						System.out.println(monster_encounter + "  나왔습니다.");
							if (monster_encounter > 4) {
								System.out.println("-----------------------------------------------------");
								System.out.println("아무 것도 없습니다. 계속 여행을 떠납니다.");
							} else if (monster_encounter <= 4) {
								System.out.println("-----------------------------------------------------");
								System.out.println("몬스터가 있는 것 같습니다. \n");
								System.out.println("전투를 하시겠습니까 (1. Battle   2. Run)");
								battle = sc.nextInt();
								
								if(battle == 1) {
									monster_kind = rdm.nextInt(dice_kind); // 주사위를 굴려 몬스터 종류를 정함
									if(monster_kind == 1) {
										m_getset.getMonster_name();
										m_getset.getMonster_HP();
										m_getset.getMonster_weapon();
										m_getset.getM_weapon_name();
										m_getset.getM_weapon_dice();
										m_getset.getMonster_attk();
										m_getset.getMonster_str();
										m_getset.getMonster_dex();
										m_getset.getMonster_level();
									}
								}
								else {
									
								}
								
								
							}
						break;
					
						case 2:
							System.out.printf("--------------------------------------------- \n"
								+ "잠을 잡니다.  zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
								// 체력회복 기능 넣기
						
						break;
					}
			} //tour while문 끝
			
		} // start while문 끝
	}

}
