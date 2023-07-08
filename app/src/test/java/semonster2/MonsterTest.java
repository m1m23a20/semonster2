package semonster2;
import static org.junit.Assert.*;
import org.junit.Test;

public class MonsterTest {
    @Test
    public void testToString() {
        Monster monster = new Monster(4,3);
        assertEquals("スーパーシーサーペント:レア度[3]",monster.toString());
    }
}
