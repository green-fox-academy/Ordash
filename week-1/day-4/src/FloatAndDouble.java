
public class FloatAndDouble {

    public static void main(String[] args) {
        // width of int = 32 (4bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4bytes)
        float myFloatValue = 5f / 3f;
        // width  of double = 64 (8bytes)
        double myDoubleValue  = 5d  / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double givenPounds = 300d;
        double resultInKg = givenPounds * 0.453_59_237d; // I can use underlines to make a number more readable.

        System.out.println("Result in Kilogramm = " + resultInKg);



    }
}
