package day_1;

import java.util.Random;
import java.util.Scanner;

public class p_Status {
	Scanner sc = new Scanner(System.in);
	Random rdm = new Random(); // math.random 이 아닌 java.util 에 있는 random 함수 사용
	
	String p_name; // 플레이어 이름 / 이름 계속 리턴 해줘야함 String 
	int p_job; // 플레이어 직업 / 리턴 해줄 필요없음 void
	int p_level; // 플레이어 레벨 / 레벨이 오르니까 리턴 해줘야 함 int 
	int p_hp; // 플레이어 체력 / 체력상황이 바뀌니까 리턴 해줘야 함 int
	int p_weapon; // 플레이어 무기 / 무기는 바뀔필요없음 void
	String weapon_name; // 플레이어 직업 /  리턴 필요 x void
	int weapon_dice; // 플레이어 공격력 주사위 Random 사용 _ int값 return
	int p_attk; // 플레이어의 공격력 void
	int p_str; // 플레이어의 힘 void 
	int p_dex; // 플레이어의 민첩성 void
	
	// Const
	public p_Status(String p_name, int p_job, int p_level, int p_hp, int p_weapon, String weapon_name, int weapon_dice,
			int p_attk, int p_str, int p_dex) {
		super();
		this.p_name = p_name;
		this.p_job = p_job;
		this.p_level = p_level;
		this.p_hp = p_hp;
		this.p_weapon = p_weapon;
		this.weapon_name = weapon_name;
		this.weapon_dice = weapon_dice;
		this.p_attk = p_attk;
		this.p_str = p_str;
		this.p_dex = p_dex;
	}

	// return user method
	void player_name() {
		
		System.out.println("당신의 이름을 입력하세요.");
		p_name = sc.nextLine();
		System.out.println("---------------------------------------------");
		System.out.println(p_name + " 님 직업을 선택해주세요.");
		System.out.println("1. 전사		2. 마법사		3. 사냥꾼");
		p_job = sc.nextInt();

		System.out.println("---------------------------------------------");
		System.out.println("무기를 선택해주세요.");
		System.out.println("---------------------------------------------");
		switch (p_job) {
		case 1: // 전사 선택
			p_hp = 200;
			p_str = 20;
			p_dex = 10;
			System.out.println("전사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Sword  2. Bastard Sword");
			p_weapon = sc.nextInt();
			if (p_weapon == 1) {
				weapon_name = "Sword";
				weapon_dice = 8;
			} else if (p_weapon == 2) {
				weapon_name = "Bastard Sword";
				weapon_dice = 10;
				p_dex = p_dex - 2; // 무게로 인한 민첩성 저하
			}
			break;

		case 2: // 마법사 선택
			p_hp = 100;
			p_str = 8;
			p_dex = 9;
			System.out.println("마법사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Staff    2. Magic Mace");
			p_weapon = sc.nextInt();
			if (p_weapon == 1) {
				weapon_name = "Staff";
				weapon_dice = 4;
			} else if (p_weapon == 2) {
				weapon_name = "Magic Mace";
				weapon_dice = 6;
				p_dex = p_dex - 1; // 무게로 인한 민첩성 저하
			}
			break;

		case 3: // 사냥꾼 선택
			p_hp = 150;
			p_str = 14;
			p_dex = 20;
			System.out.println("사냥꾼은 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Long Bow    2. Bolt");
			p_weapon = sc.nextInt();
			if (p_weapon == 1) {
				weapon_name = "Long Bow";
				weapon_dice = 6;
			} else if (p_weapon == 2) {
				weapon_name = "Bolt";
				weapon_dice = 8;
				p_dex = p_dex - 2; // 무게로 인한 민첩성 저하
			}
			break;
		}

		System.out.println("-------------------------------------------------------");
		System.out.printf("* " + weapon_name + " * 을/를 선택하셨습니다. 공격 시 " + weapon_dice + " 면체 주사위를 굴립니다. \n ");
		System.out.println("-------------------------------------------------------");
		System.out.println("마지막으로 " + p_name + " 님의 능력치를 정하겠습니다.");
		System.out.println("10면체 주사위 두개를 굴립니다. 두개의 합에 따라 능력이 정해집니다.");
		System.out.println("-------------------------------------------------------");

		int dice_10_1 = rdm.nextInt(10);
		int dice_10_2 = rdm.nextInt(10);
		int dice_10_sum = dice_10_1 + dice_10_2;

		System.out.println("첫번째 주사위는 " + dice_10_1);
		System.out.println("두번째 주사위는 " + dice_10_2);

		if (dice_10_sum >= 15) {
			// 각 직업 기본 능력치 그대로
		} else if (dice_10_sum >= 8 && dice_10_sum < 15) { // 능력치 10% 저하
			p_hp = p_hp - ((p_hp * 10) / 100);
			p_str = p_str - ((p_str * 10) / 100);
			p_dex = p_dex - ((p_dex * 10) / 100);
		} else if (dice_10_sum < 8) { // 능력치 20% 저하
			p_hp = p_hp - ((p_hp * 20) / 100);
			p_str = p_str - ((p_str * 20) / 100);
			p_dex = p_dex - ((p_dex * 20) / 100);
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf(p_name + " 님 당신의 능력치 입니다. \n" + "체력 : " + p_hp + " \n" + "힘 : " + p_str + " \n"
				+ "민첩 : " + p_dex + " \n" + "무기 :" + weapon_name + " \n");
		System.out.println("-------------------------------------------------------");
	}

	
}
