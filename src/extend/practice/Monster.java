package extend.practice;

public abstract class Monster extends Living {
	protected String weapon;

	public Monster(String name, int hp, int offensive) {
		super(name, hp, offensive);
	}
}
