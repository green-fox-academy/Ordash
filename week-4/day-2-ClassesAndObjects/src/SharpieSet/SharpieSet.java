package SharpieSet;

import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> setOfSharpies = new ArrayList<>();


    public void sharpieAdder(Sharpie sharpie) {

        setOfSharpies.add(sharpie);

    }

    public int countUsable() {

        int usableSharpies = 0;
        for (int i = 0; i < setOfSharpies.size(); i++) {

            if ((setOfSharpies.get(i)).inkAmount > 0) {
                usableSharpies++;
            }
        }
        return usableSharpies;
    }

    public void removeTrash() {

        for (int i = 0; i < setOfSharpies.size(); i++) {

            if ((setOfSharpies.get(i)).inkAmount <= 0) {
                setOfSharpies.remove(i);
            }

        }
    }
}
