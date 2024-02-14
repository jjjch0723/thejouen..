package day_1;
import java.util.Random;
import java.util.Scanner;

public class p_Monster {
	Scanner sc = new Scanner(System.in);
	Random rdm = new Random(); // math.random 이 아닌 java.util 에 있는 random 함수 사용
	
	String monster_name; // 몬스터 이름
	int monster_HP; // 몬스터 체력
	int monster_weapon; // 몬스터 무기
	String m_weapon_name; // 몬스터 무기명
	int m_weapon_dice; // 몬스터 공격력 주사위
	int monster_attk; // 몬스터 공격력
	int monster_str; // 몬스터 힘
	int monster_dex; // 몬스터 민첩성
	int monster_level; // 몬스터 레벨
	
	// Const
	public p_Monster(Scanner sc, Random rdm, String monster_name, int monster_HP, int monster_weapon,
			String m_weapon_name, int m_weapon_dice, int monster_attk, int monster_str, int monster_dex,
			int monster_level) {
		super();
		this.sc = sc;
		this.rdm = rdm;
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
	
	
}
