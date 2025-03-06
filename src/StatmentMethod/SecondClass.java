package StatmentMethod;

public class SecondClass {

    public static void main(String[] args) {


        calaculateScore(true,800,3,5);
    }

    public static void calaculateScore(boolean gameOver, int finalScore,int levelCompleted,int bonus  ) {

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}


