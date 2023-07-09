package semonster2;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Test;

public class SeMonsterGameTest {
	@Test
	public void testToString() {
		var l = new LinkedList<Integer>();

		// NOTE: デッキサイズ * モンスター1体当たり2つ * 2人
		for (int i = 0; i < 8 * 2 * 2; ++i) {
			l.add(0);
		}

		var game = new SeMonsterGame(l);

		game.addPlayer("hoge");
		game.draw("hoge");
		game.addPlayer("huga");
		game.draw("huga");

		assertEquals(
				"Players:\nDeck:hoge\nHP:5\nスライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]\nDeck:huga\nHP:5\nスライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]\n",
				game.toString());
	}
}
