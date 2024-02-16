package game_class_separate;

import java.util.Scanner;

// 무기 선택 메서드
public class Select_weapon {
	
	public void select_weapon(Player_Status ps) {
		Scanner sc = new Scanner(System.in);
		
		int weaponkind = 0;
		
		System.out.println("무기를 선택해주세요.");
		System.out.println("---------------------------------------------");
		switch (ps.getP_job()) {
		case 1: // 전사 선택
			ps.setP_hp(200);
			ps.setP_str(20);
			ps.setP_dex(10);
			System.out.println("전사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Sword  2. Bastard Sword");
			ps.setP_weapon(weaponkind);
			if (weaponkind == 1) {
				ps.setWeapon_name("Sword");
				ps.setWeapon_dice(4);
			} else if (weaponkind == 2) {
				ps.setWeapon_name("Bastard Sword");
				ps.setWeapon_dice(6);
				// ps.p_dex = ps.p_dex - 2; // 무게로 인한 민첩성 저하
				int change_dex = ps.getP_dex() - 2;
				ps.setP_dex(change_dex);
			}
			break;

		case 2: // 마법사 선택
			ps.setP_hp(100);
			ps.setP_str(8);;
			ps.setP_dex(9);
			System.out.println("마법사는 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Staff    2. Magic Mace");
			ps.setP_weapon(weaponkind);
			if (weaponkind == 1) {
				ps.setWeapon_name("Staff");
				ps.setWeapon_dice(6);
			} else if (weaponkind == 2) {
				ps.setWeapon_name("Magic Mace");
				ps.setWeapon_dice(8);
				// ps.p_dex = ps.p_dex - 1; // 무게로 인한 민첩성 저하
				int change_dex = ps.getP_dex() - 1;
				ps.setP_dex(change_dex);
			}
			break;

		case 3: // 사냥꾼 선택
			ps.setP_hp(150);
			ps.setP_str(14);;
			ps.setP_dex(20);
			System.out.println("사냥꾼은 다음 무기를 선택할 수 있습니다.");
			System.out.println("1. Long Bow    2. Bolt");
			ps.setP_weapon(weaponkind);
			if (weaponkind == 1) {
				ps.setWeapon_name("Long Bow");
				ps.setWeapon_dice(8);
			} else if (weaponkind == 2) {
				ps.setWeapon_name("Bolt");
				ps.setWeapon_dice(8);
				// ps.p_dex = ps.p_dex - 2; // 무게로 인한 민첩성 저하
				int change_dex = ps.getP_dex() - 2;
				ps.setP_dex(change_dex);
			}
			break;
		}
		weaponkind = sc.nextInt();
		
		System.out.println("-------------------------------------------------------");
		System.out.printf("* " + ps.getWeapon_name() + " * 을/를 선택하셨습니다. 공격 시 " + ps.getWeapon_dice() + " 면체 주사위를 굴립니다. \n ");
		System.out.println("-------------------------------------------------------");
	}

}
