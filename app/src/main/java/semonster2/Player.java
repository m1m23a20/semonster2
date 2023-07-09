package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
	String name;
	int hp;
	ArrayList<Monster> monsterDeck = new ArrayList<>();
	LinkedList<Integer> randomNumberList;
	final int MONSTER_DECK_SIZE = 8;

	Player(LinkedList<Integer> randomNumberList, String playerName) {
		this.randomNumberList = randomNumberList;
		this.name = playerName;
		this.hp = 5;
	}

	public void drawMonsters() {
		for (int i = 0; i < MONSTER_DECK_SIZE; i++) {
			this.monsterDeck.add(new Monster(this.randomNumberList.pop(), this.randomNumberList.pop()));
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Deck:" + this.name + "\n");
		sb.append("HP:" + this.hp + "\n");
		for (Monster m : this.monsterDeck) {
			sb.append(m);
		}
		sb.append("\n");
		return sb.toString();
	}
}
