import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class fiveTree {
    public static void main(String[] args) {

        ArrayList<Map<String, Object>> trees = new ArrayList<>();

        Map<String, Object> tree1 = new HashMap<String, Object>();
        tree1.put("type", "Oak");
        tree1.put("leaf color", "brown");
        tree1.put("age", 20);
        tree1.put("sex", "male");
        trees.add( tree1 );


        Map<String, Object> tree2 = new HashMap<String, Object>();
        tree2.put("type", "Pine");
        tree2.put("leaf color", "green");
        tree2.put("age", 25);
        tree2.put("sex", "female");
        trees.add( tree2 );


        Map<String, Object> tree3 = new HashMap<String, Object>();
        tree3.put("type", "Palm");
        tree3.put("leaf color", "green");
        tree3.put("age", 15);
        tree3.put("sex", "male");
        trees.add( tree1 );


        Map<String, Object> tree4 = new HashMap<String, Object>();
        tree4.put("type", "Walnut");
        tree4.put("leaf color", "yellow");
        tree4.put("age", 5);
        tree4.put("sex", "female");
        trees.add( tree1 );


        Map<String, Object> tree5 = new HashMap<String, Object>();
        tree5.put("type", "Cherry");
        tree5.put("leaf color", "green");
        tree5.put("age", 30);
        tree5.put("sex", "male");
        trees.add( tree1 );
    }
}
