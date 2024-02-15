package game;

import java.util.Random;
import java.util.Scanner;

public class p_Status {

	public int player_make() {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random(); // math.random 이 아닌 java.util 에 있는 random 함수 사용

		p_Status_getset p = new p_Status_getset();

		System.out.println("당신의 이름을 입력하세요.");
		p.p_name = sc.nextLine();
		System.out.println("---------------------------------------------");
		System.out.println(p.p_name + " 님 직업을 선택해주세요.");
		System.out.println("1. 전사		2. 마법사		3. 사냥꾼");
		p.p_job = sc.nextInt();

		System.out.println("---------------------------------------------");
		System.out.println("무기를 선택해주세요.");
		System.out.println("---------------------------------------------");
		switch (p.p_job) {
		case 1: // 전사 선택
			p.p_hp = 200;
			p.p_str = 20;
			p.p_dex = 10;
			System.out.println("전사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Sword  2. Bastard Sword");
			p.p_weapon = sc.nextInt();
			if (p.p_weapon == 1) {
				p.weapon_name = "Sword";
				p.weapon_dice = 8;
			} else if (p.p_weapon == 2) {
				p.weapon_name = "Bastard Sword";
				p.weapon_dice = 10;
				p.p_dex = p.p_dex - 2; // 무게로 인한 민첩성 저하
			}
			break;

		case 2: // 마법사 선택
			p.p_hp = 100;
			p.p_str = 8;
			p.p_dex = 9;
			System.out.println("마법사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Staff    2. Magic Mace");
			p.p_weapon = sc.nextInt();
			if (p.p_weapon == 1) {
				p.weapon_name = "Staff";
				p.weapon_dice = 4;
			} else if (p.p_weapon == 2) {
				p.weapon_name = "Magic Mace";
				p.weapon_dice = 6;
				p.p_dex = p.p_dex - 1; // 무게로 인한 민첩성 저하
			}
			break;

		case 3: // 사냥꾼 선택
			p.p_hp = 150;
			p.p_str = 14;
			p.p_dex = 20;
			System.out.println("사냥꾼은 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Long Bow    2. Bolt");
			p.p_weapon = sc.nextInt();
			if (p.p_weapon == 1) {
				p.weapon_name = "Long Bow";
				p.weapon_dice = 6;
			} else if (p.p_weapon == 2) {
				p.weapon_name = "Bolt";
				p.weapon_dice = 8;
				p.p_dex = p.p_dex - 2; // 무게로 인한 민첩성 저하
			}
			break;
		}

		System.out.println("-------------------------------------------------------");
		System.out.printf("* " + p.weapon_name + " * 을/를 선택하셨습니다. 공격 시 " + p.weapon_dice + " 면체 주사위를 굴립니다. \n ");
		System.out.println("-------------------------------------------------------");
		System.out.println("마지막으로 " + p.p_name + " 님의 능력치를 정하겠습니다.");
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
			p.p_hp = p.p_hp - ((p.p_hp * 10) / 100);
			p.p_str = p.p_str - ((p.p_str * 10) / 100);
			p.p_dex = p.p_dex - ((p.p_dex * 10) / 100);
		} else if (dice_10_sum < 8) { // 능력치 20% 저하
			p.p_hp = p.p_hp - ((p.p_hp * 20) / 100);
			p.p_str = p.p_str - ((p.p_str * 20) / 100);
			p.p_dex = p.p_dex - ((p.p_dex * 20) / 100);
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.printf(p.p_name + " 님 당신의 능력치 입니다. \n" + "체력 : " + p.p_hp + " \n" + "힘 : " + p.p_str + " \n" + "민첩 : "
				+ p.p_dex + " \n" + "무기 :" + p.weapon_name + " \n");
		System.out.println("-------------------------------------------------------");
		System.out.println(p.p_name + " 님 이대로 진행하시겠습니까? (1. YES   2. NO)");
		System.out.println("-------------------------------------------------------");
		int character_set_flag = sc.nextInt();
		
		return character_set_flag;
	}
}
