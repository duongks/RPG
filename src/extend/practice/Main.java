package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Human brave = new Brave("勇者", 100, 10);
		Human fightre = new Fighter("戦士", 100, 10);
		Human wizard = new Wizard("魔法使い", 100, 10);

		Monster slime = new Slime("スライム", 100, 5);
		Monster oak = new Oak("オーク", 100, 6);
		Monster dragon = new Dragon("ドラゴン", 100, 9);

		List<Human> listHuman = new ArrayList<>();
		listHuman.add(brave);
		listHuman.add(fightre);
		listHuman.add(wizard);

		List<Monster> listMonster = new ArrayList<>();
		listMonster.add(dragon);
		listMonster.add(oak);
		listMonster.add(slime);

		while (true) {

			Human human = listHuman.get(Rand.get(listHuman.size()));

			Monster monster = listMonster.get(Rand.get(listMonster.size()));

			System.out.println("人間のターン！");

			human.attack(monster);
			if (monster.hp <= 0) {
				listMonster.remove(monster);
				System.out.println(monster.getName() + "は倒れた。");
			}
			if (listMonster.isEmpty()) {
				System.out.println();
				System.out.println("勇者達は勝利した！");
				break;
			}
			System.out.println("Monsterのターン！");

			monster = listMonster.get(Rand.get(listMonster.size()));
			monster.attack(human);
			if (human.hp <= 0) {
				listHuman.remove(human);
				System.out.println(human.getName() + "は倒れた。");
			}
			if (listHuman.isEmpty()) {
				System.out.println();
				System.out.println("モンスター達は勝利した！");
				break;
			}
		}
	}
}
