public class RandomNumber {
    public static void main(String[] args) {

        //      0 <= Math.random() < 1.0

        //    50 + Math.random() * 50  <---- This will give a a random number between 50 and 99.
        //
        //    explanation: (0 <= randomNumber < 1.0) * 50 + 50 <--- so it can range between 0 and 49 + 50
        //                                                      -----> So it can range between 50 and 99.

        int min = 5;
        int max = 15;
        int range = max-min +1;

        for (int i=0; i<10; i++) {
            System.out.println( Math.round(Math.random()*10) +10);
        }

        int max1 =100;
        int min1 = 10;

        for (int i=0; i<10; i++) {
            System.out.println( Math.round(Math.random()*(max1-min1)+1+min1 ));
        }

        System.out.println("======");

        System.out.println(Math.round(Math.random()*62000000));
        // 22356456

        for (int i = 0; i < 100; i++) {

            System.out.println((int)(150+(Math.random()*51)));
        }


    }
}
