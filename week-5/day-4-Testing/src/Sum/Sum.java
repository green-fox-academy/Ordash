package Sum;

import java.util.ArrayList;

public class Sum {


    public int sum(ArrayList<Integer> numbers) {
        int SumOfElements = 0;
        for (int number : numbers) {
            SumOfElements += number;
        }
        return SumOfElements;
    }
}
