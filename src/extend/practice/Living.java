package extend.practice;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;//攻撃力

	public Living(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

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

	public int getOffensive() {
		return offensive;
	}

	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

	abstract void attack(Living target);
}
