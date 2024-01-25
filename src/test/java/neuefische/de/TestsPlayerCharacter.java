package neuefische.de;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsPlayerCharacter {
    @Test
    public void getX(){
        // GIVEN
        int x = 0;
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void getY(){
        // GIVEN
        int y = 0;
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsW_returnYas1(){
        // GIVEN
        char input = 'w';
        int expected = 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }
}
