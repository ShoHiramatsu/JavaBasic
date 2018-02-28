package practice13.common;

public class SuperHero extends Hero {
	Hero hero = new Hero();


	private Item equipment;

	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}



}
