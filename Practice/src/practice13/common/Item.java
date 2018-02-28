package practice13.common;

public class Item {
	private String name;
	private int additionalDamage;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return this.additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;

	}

}
