package day_1;

public class monster {
    private String m_name;
    private int m_hp;
    private String m_weaponName;
    private int m_weaponDice;
    private int m_strength;
    private int m_dexterity;
    private int m_level;
    
    public monster() {
		super();
	}

	public monster(String name, int hp, String weaponName, int weaponDice, int strength, int dexterity, int level) {
        this.m_name = name;
        this.m_hp = hp;
        this.m_weaponName = weaponName;
        this.m_weaponDice = weaponDice;
        this.m_strength = strength;
        this.m_dexterity = dexterity;
        this.m_level = level;
    }

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_hp() {
		return m_hp;
	}

	public void setM_hp(int m_hp) {
		this.m_hp = m_hp;
	}

	public String getM_weaponName() {
		return m_weaponName;
	}

	public void setM_weaponName(String m_weaponName) {
		this.m_weaponName = m_weaponName;
	}

	public int getM_weaponDice() {
		return m_weaponDice;
	}

	public void setM_weaponDice(int m_weaponDice) {
		this.m_weaponDice = m_weaponDice;
	}

	public int getM_strength() {
		return m_strength;
	}

	public void setM_strength(int m_strength) {
		this.m_strength = m_strength;
	}

	public int getM_dexterity() {
		return m_dexterity;
	}

	public void setM_dexterity(int m_dexterity) {
		this.m_dexterity = m_dexterity;
	}

	public int getM_level() {
		return m_level;
	}

	public void setM_level(int m_level) {
		this.m_level = m_level;
	}
    
    // Getters and Setters 완료
 
}

