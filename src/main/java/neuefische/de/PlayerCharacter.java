package neuefische.de;

public class PlayerCharacter {
    static int playerPositionX = 0;
    static int playerPositionY = 0;
    public static int getX(){
        return playerPositionX;
    }
    public static int getY(){
        return playerPositionY;
    }

    public static void movePlayer(char input){
        if (input == 'w')
            playerPositionY++;
        if (input == 's')
            playerPositionY--;
        if (input == 'd')
            playerPositionX++;
        if (input == 'a')
            playerPositionX--;
    }
}
