package semonster2;
import static org.junit.Assert.*;
import org.junit.Test;

public class MonsterTest {
    @Test
    public void testToString() {
        Monster monster = new Monster(4,0);
        assertEquals("シーサーペント:レア度[0]",monster.toString());
    }
}
