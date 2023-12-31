package semonster2;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SeMonsterGame {
	LinkedHashMap<String, Player> playerMap = new LinkedHashMap<>();
	LinkedList<Integer> randomNumberList;

	SeMonsterGame(LinkedList<Integer> randomNumberList) {
		this.randomNumberList = randomNumberList;
	}

	void addPlayer(String playerName) {
		var player = new Player(randomNumberList, playerName);
		this.playerMap.put(playerName, player);
	}

	void draw(String playerName) {
		var player = this.playerMap.get(playerName);
		player.drawMonsters();
		System.out.println(player);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Players:\n");
		for (var v : this.playerMap.values()) {
			sb.append(v);
		}
		return sb.toString();
	}
}
