public class arrayExamples {
     public static void main(String[] args) {
         int jane = 3;
         final int john = 2;
         int[] numbers = new int [10];
         System.out.println(numbers.toString());
         System.out.println(numbers);
         System.out.println(numbers[0]);
         numbers[9] = 10;
         System.out.println(numbers.length);

         int[] copyOfNumers = numbers;

         numbers[numbers.length - 1] = 101;

         System.out.println("==========");
         System.out.println(numbers[9]); // 101
         System.out.println(copyOfNumers[9]); //10
         System.out.println("==========");
         // multidimension arrays (can be as many as we want)
         int [][] matrix;
         int marixAsWell [][];
         // int marixAsWell [0][1];

         final boolean[] booleans = new boolean [2];
         booleans[0] = true;
     }
}
