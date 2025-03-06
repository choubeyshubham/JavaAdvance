package StatmentMethod;

public class ThirdClass {
    /*



     */

    public static void main(String[] args) {



    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName+" managed o get into position "+
                highScorePosition+" on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else if (playerScore < 0) {
            return 0;
        } else {
            return 4;
        }

//        return 0;
    }

}
