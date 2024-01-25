package neuefische.de;

public class PlayerCharacter {
    private static int playerPositionX = 0;
    private static int playerPositionY = 0;
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

    public static void resetPlayerPosition(){
        playerPositionX = 0;
        playerPositionY = 0;
    }
}
