package day_1;

public class monster {
    private String name;
    private int hp;
    private String weaponName;
    private int weaponDice;
    private int strength;
    private int dexterity;
    private int level;

    public monster(String name, int hp, String weaponName, int weaponDice, int strength, int dexterity, int level) {
        this.name = name;
        this.hp = hp;
        this.weaponName = weaponName;
        this.weaponDice = weaponDice;
        this.strength = strength;
        this.dexterity = dexterity;
        this.level = level;
    }
    
    // Getters and Setters 완료
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getWeaponDice() {
		return weaponDice;
	}

	public void setWeaponDice(int weaponDice) {
		this.weaponDice = weaponDice;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

    
}

