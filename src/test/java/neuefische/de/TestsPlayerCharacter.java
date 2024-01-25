package neuefische.de;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsPlayerCharacter {
    @Test
    public void getX(){
        // GIVEN
        PlayerCharacter.playerPositionX = 0;
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void getY(){
        // GIVEN
        PlayerCharacter.playerPositionY = 0;
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsW_returnY1(){
        // GIVEN
        PlayerCharacter.playerPositionY = 0;
        char input = 'w';
        int expected = PlayerCharacter.playerPositionY + 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsS_returnYminus1(){
        // GIVEN
        PlayerCharacter.playerPositionY = 0;
        char input = 's';
        int expected = PlayerCharacter.playerPositionY - 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsW_returnX1(){
        // GIVEN
        PlayerCharacter.playerPositionX = 0;
        char input = 'd';
        int expected = PlayerCharacter.playerPositionX + 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    public void movePlayer_whenInputIsS_returnXminus1(){
        // GIVEN
        PlayerCharacter.playerPositionX = 0;
        char input = 'a';
        int expected = PlayerCharacter.playerPositionX - 1;
        // WHEN
        PlayerCharacter.movePlayer(input);
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);
    }
}
