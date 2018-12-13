import java.util.ArrayList; // <--- These are libraries
import java.util.Iterator;
import java.util.Arrays;


// ArrayLists automatically resize when you add or delete items to the not like the normal Array


public class ArraysBana {
    public static void main(String[] args) {

        ArrayList arrayListOne;

        arrayListOne = new ArrayList(); // <--Don't need to declare what size is the array because it changes
                                        //    its size automatically.

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<>(); // <--- It takes any kind of data type but if it's
                                                     //      declared itt will only take that specific type.


        names.add("Sanyi"); // <-- This is how to add elements to an ArrayList.
        names.add("Bela");
        names.add("Feri");
        names.add("John");
        names.add("Jack");
        names.add("Oliver");
        names.add("Jozsi");
        names.add("Pityu");

        names.add(2, "Moni"); // <-- to assign an element to a specific index.

        System.out.println("+++++++++");
        System.out.println("Bela".compareTo("Feri"));

        System.out.println("++++++++");
        names.remove(1); //<--- to remove an element from ArrayList

        //names.removeRange(6, 7); <-- working only in a special way.

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println(names);

        for (String i : names ) { // <--the most convenient way to print out the elements of an ArrayList.
            System.out.println(i);
        }

        Iterator indivItems = names.iterator();

        while(indivItems.hasNext()) {

            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names); // <--to copy the content of the "names" ArrayList to nameCopy ArrayList.

        String eviCica = "Evi Cica";

        names.add(eviCica); // <-- add an element to the ArrayList.

        if (names.contains(eviCica)) { // <-- to check if an item is in the ArrayList.
            System.out.println("Evi Cica is here!");
        }

        if (names.containsAll(nameCopy)) { // <-- to check if the contents of one ArrayList is in the other
            System.out.println("Everything in nameCopy is in names");
        }

        names.clear(); // <-- to clear the contents of an ArrayList.

        if(names.isEmpty()) {
            System.out.println("ArrayList is empty");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(8);

















    }
}
