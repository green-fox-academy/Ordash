
public class CreatingANewMethod {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800 ;
        int levelsCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelsCompleted, bonus);
        System.out.println("Your final score was " + highscore);


    }
    //                                                      arguments
    //                                 /--------------------------------------------------------\
    public static int calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {



            int finalscore = score + (levelsCompleted * bonus);
            finalscore += 2000;






        int highScorePosition =  calculateHighScorePosition(1500);
        displayHighScorePosition("Jani", highScorePosition);

        highScorePosition =  calculateHighScorePosition(900);
        displayHighScorePosition("Bela", highScorePosition);

        highScorePosition =  calculateHighScorePosition(400);
        displayHighScorePosition("Tibi", highScorePosition);

        highScorePosition =  calculateHighScorePosition(50);
        displayHighScorePosition("Gabor", highScorePosition);

        return finalscore;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get  into position "
                + highScorePosition + "on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore > 500) {
            return 2;
        } else if (playerScore < 500 && playerScore > 100) {
            return 3;
        } else {
            return 4;
        }


    }
}
