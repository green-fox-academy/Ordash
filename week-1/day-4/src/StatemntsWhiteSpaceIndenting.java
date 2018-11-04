

public class StatemntsWhiteSpaceIndenting {

    public static void main(String[] args) { //<<<The name of the method is 'main'
        //                                     and in between the curly brackets there are the statements
        //                                      which form the method.

    //    statement
    //  /------------------\
        int myVariable = 50;
    //      \--------------/
    //        expression

        boolean gameOver = true;
        int score = 800 ;
        int levelsCompleted = 5;
        int bonus = 100;

//        if (score == 5000) { // <----code block (best to use just to make the code clearer
//            System.out.println("Your score was 5000");
//        } else if (score < 1000){
//
//        }// <---code block
//         else {
//            System.out.println("You got here.");
//        }

        if(gameOver == true) {
            int finalscore = score + (levelsCompleted * bonus);
            System.out.println("Yout final score was " + finalscore);

        } // once this code block was processed it will delete the variable within the code block

        int score2 = 10000;
        int levelsCompleted2 = 8;
        int bonus2 = 200;

        if(gameOver == true) {
            int finalscore2 = score2 + (levelsCompleted2 * bonus2);
            System.out.println("Your second final score was " + finalscore2);
        }





















    }
}
