package extend.practice;

public class Brave extends Human {

	public Brave(String name, int hp, int offensive) {
		super(name, hp, offensive);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void attack(Living target) {
		int damage = Rand.get(9)*offensive;
		target.hp -= damage;
		System.out.println(this.name + "が剣で攻撃！" + target.name + "に" + damage + "のダメージを与えた");
	}
}
