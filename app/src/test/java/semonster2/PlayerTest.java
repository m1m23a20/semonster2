package semonster2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class PlayerTest {
	@Test
	public void testToString() {
		LinkedList<Integer> l = new LinkedList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		var player = new Player(l, "hoge");
		player.drawMonsters();

		assertEquals("Deck:hoge\nスライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]スライム:レア度[0]", player.toString());
	}
}
