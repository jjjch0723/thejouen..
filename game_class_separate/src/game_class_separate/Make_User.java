package game_class_separate;

public class Make_User {
	public void make_user(Player_Status ps) {
		Make_name m_name = new Make_name();
		Select_job s_Job = new Select_job();
		Select_weapon s_Weapon = new Select_weapon();
		Stat_dice s_Dice = new Stat_dice(); // 1 or 2반환
		
		boolean character_set = true; // 플레이어 생성 진행 여뷰
		int character_set_flag;
		//while 문안에 charcter_set넣기
		while(character_set) {
			m_name.p_name_make(ps); //
			s_Job.select_job(ps);
			s_Weapon.select_weapon(ps);
			character_set_flag = s_Dice.stat_dice(ps);
			
			switch (character_set_flag) {
			case 1:
				character_set = false;
				break;

			case 2:
				character_set = true;
				System.out.println("---------------------------------------------");
				break;
			}
			
		}// while문 끝
		
		
	}
}
