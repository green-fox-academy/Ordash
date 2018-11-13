package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

        ArrayList<Domino> finalList = new ArrayList<>();
        finalList.add(dominoes.get(0));
        for (int i = 0; i < 5; i++) {

            for (int j = 1; j < 6; j++) {
                if (finalList.get(i).getRightSide() == dominoes.get(j).getLeftSide()) {
                    finalList.add(dominoes.get(j));
                }
            }

        }
        System.out.println(finalList);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
