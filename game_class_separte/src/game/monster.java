package game;

public class monster {
	monster_getset m = new monster_getset();
    /* 몬스터 종류 설정 */
    void monster_set(int monster_kind){
	    switch (monster_kind) {
	    case 1:
	        m.monster_name = "Kobold"; // 몬스터 이름
	        m.monster_HP = 100; // 몬스터 체력
	        m.m_weapon_name = "Dangger"; // 몬스터 무기명
	        m.m_weapon_dice = 4; // 몬스터 공격력 주사위
	        m.monster_str = 10; // 몬스터 힘
	        m.monster_dex = 8; // 몬스터 민첩성
	        m.monster_level = 1; // 몬스터 레벨
	        break;
	
	    case 2:
	        m.monster_name = "Ork"; // 몬스터 이름
	        m.monster_HP = 150; // 몬스터 체력
	        m.m_weapon_name = "Stick"; // 몬스터 무기명
	        m.m_weapon_dice = 6; // 몬스터 공격력 주사위
	        m.monster_str = 14; // 몬스터 힘
	        m.monster_dex = 7; // 몬스터 민첩성
	        m.monster_level = 2; // 몬스터 레벨
	        break;
	
	    case 3:
	        m.monster_name = "Ork leader"; // 몬스터 이름
	        m.monster_HP = 200; // 몬스터 체력
	        m.m_weapon_name = "Mace"; // 몬스터 무기명
	        m.m_weapon_dice = 8; // 몬스터 공격력 주사위
	        m.monster_str = 15; // 몬스터 힘
	        m.monster_dex = 9; // 몬스터 민첩성
	        m.monster_level = 3; // 몬스터 레벨
	        break;
	
	    case 4:
	        m.monster_name = "Ogre"; // 몬스터 이름
	        m.monster_HP = 300; // 몬스터 체력
	        m.m_weapon_name = "Stick"; // 몬스터 무기명
	        m.m_weapon_dice = 6; // 몬스터 공격력 주사위
	        m.monster_str = 18; // 몬스터 힘
	        m.monster_dex = 10; // 몬스터 민첩성
	        m.monster_level = 4; // 몬스터 레벨
	        break;
	
	    case 5:
	        m.monster_name = "Fallen knight"; // 몬스터 이름
	        m.monster_HP = 200; // 몬스터 체력
	        m.m_weapon_name = "Bastard Sword"; // 몬스터 무기명
	        m.m_weapon_dice = 8; // 몬스터 공격력 주사위
	        m.monster_str = 18; // 몬스터 힘
	        m.monster_dex = 12; // 몬스터 민첩성
	        m.monster_level = 5; // 몬스터 레벨
	        break;
	    }
}
	
}