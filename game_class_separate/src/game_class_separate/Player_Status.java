package game_class_separate;

// 변수 저장 및 getter, setter
public class Player_Status {
	/* 플레이어 설정 초기화 */
	String p_name = ""; // 플레이어 이름
	int p_job = 0; // 플레이어 직업
	int p_level = 1; // 플레이어 레벨
	int p_hp = 0; // 플레이어 체력
	int p_weapon = 0; // 플레이어 무기
	String weapon_name = ""; // 플레이어 직업
	int weapon_dice = 0; // 플레이어 공격력 주사위
	int p_attk = 0; // 플레이어의 공격력
	int p_str = 0; // 플레이어의 힘
	int p_dex = 0; // 플레이어의 민첩성
	
	public Player_Status() {}

	public Player_Status(String p_name, int p_job, int p_level, int p_hp, int p_weapon, String weapon_name,
			int weapon_dice, int p_attk, int p_str, int p_dex) {
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

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_job() {
		return p_job;
	}

	public void setP_job(int p_job) {
		this.p_job = p_job;
	}

	public int getP_level() {
		return p_level;
	}

	public void setP_level(int p_level) {
		this.p_level = p_level;
	}

	public int getP_hp() {
		return p_hp;
	}

	public void setP_hp(int p_hp) {
		this.p_hp = p_hp;
	}

	public int getP_weapon() {
		return p_weapon;
	}

	public void setP_weapon(int p_weapon) {
		this.p_weapon = p_weapon;
	}

	public String getWeapon_name() {
		return weapon_name;
	}

	public void setWeapon_name(String weapon_name) {
		this.weapon_name = weapon_name;
	}

	public int getWeapon_dice() {
		return weapon_dice;
	}

	public void setWeapon_dice(int weapon_dice) {
		this.weapon_dice = weapon_dice;
	}

	public int getP_attk() {
		return p_attk;
	}

	public void setP_attk(int p_attk) {
		this.p_attk = p_attk;
	}

	public int getP_str() {
		return p_str;
	}

	public void setP_str(int p_str) {
		this.p_str = p_str;
	}

	public int getP_dex() {
		return p_dex;
	}

	public void setP_dex(int p_dex) {
		this.p_dex = p_dex;
	}
	
	
}
