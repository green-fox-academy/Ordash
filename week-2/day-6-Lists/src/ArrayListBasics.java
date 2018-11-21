import java.util.ArrayList; // <--- These are libraries
import java.util.Iterator;
import java.util.Arrays;


// ArrayLists automatically resize when you add or delete items to the not like the normal Array


public class ArrayListBasics {
    public static void main(String[] args) {


        // Collection type\
        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(90);
        grades.add(85);
        grades.add(70);

        grades.remove(1);
        for (int i = 0; i<grades.size(); i++) {

            System.out.printf("Grade #%d == %d\n",i, grades.get(i));
            //grades[i] == grades.get(i) <-- difference between normal Array and ArrayList
        }




    }


}
