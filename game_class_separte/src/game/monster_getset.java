package game;

public class monster_getset {
	String monster_name = ""; // 몬스터 이름
	int monster_HP = 0; // 몬스터 체력
	int monster_weapon = 0; // 몬스터 무기
	String m_weapon_name = ""; // 몬스터 무기명
	int m_weapon_dice = 0; // 몬스터 공격력 주사위
	int monster_attk = 0; // 몬스터 공격력
	int monster_str = 0; // 몬스터 힘
	int monster_dex = 0; // 몬스터 민첩성
	int monster_level = 0; // 몬스터 레벨
	
	public monster_getset() {}

	public monster_getset(String monster_name, int monster_HP, int monster_weapon, String m_weapon_name, int m_weapon_dice,
			int monster_attk, int monster_str, int monster_dex, int monster_level) {
		this.monster_name = monster_name;
		this.monster_HP = monster_HP;
		this.monster_weapon = monster_weapon;
		this.m_weapon_name = m_weapon_name;
		this.m_weapon_dice = m_weapon_dice;
		this.monster_attk = monster_attk;
		this.monster_str = monster_str;
		this.monster_dex = monster_dex;
		this.monster_level = monster_level;
	}

	public String getMonster_name() {
		return monster_name;
	}

	public void setMonster_name(String monster_name) {
		this.monster_name = monster_name;
	}

	public int getMonster_HP() {
		return monster_HP;
	}

	public void setMonster_HP(int monster_HP) {
		this.monster_HP = monster_HP;
	}

	public int getMonster_weapon() {
		return monster_weapon;
	}

	public void setMonster_weapon(int monster_weapon) {
		this.monster_weapon = monster_weapon;
	}

	public String getM_weapon_name() {
		return m_weapon_name;
	}

	public void setM_weapon_name(String m_weapon_name) {
		this.m_weapon_name = m_weapon_name;
	}

	public int getM_weapon_dice() {
		return m_weapon_dice;
	}

	public void setM_weapon_dice(int m_weapon_dice) {
		this.m_weapon_dice = m_weapon_dice;
	}

	public int getMonster_attk() {
		return monster_attk;
	}

	public void setMonster_attk(int monster_attk) {
		this.monster_attk = monster_attk;
	}

	public int getMonster_str() {
		return monster_str;
	}

	public void setMonster_str(int monster_str) {
		this.monster_str = monster_str;
	}

	public int getMonster_dex() {
		return monster_dex;
	}

	public void setMonster_dex(int monster_dex) {
		this.monster_dex = monster_dex;
	}

	public int getMonster_level() {
		return monster_level;
	}

	public void setMonster_level(int monster_level) {
		this.monster_level = monster_level;
	}
	
	
}
