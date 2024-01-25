package neuefische.de;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsPlayerCharacter {
    @Test
    public void getX(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void getY(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsW_returnY1(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        char input = 'w';
        int expected = PlayerCharacter.getY() + 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsS_returnYminus1(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        char input = 's';
        int expected = PlayerCharacter.getY() - 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsW_returnX1(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        char input = 'd';
        int expected = PlayerCharacter.getX() + 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsS_returnXminus1(){
        // GIVEN
        PlayerCharacter.resetPlayerPosition();
        char input = 'a';
        int expected = PlayerCharacter.getX() - 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }
}
