import java.util.Arrays;
public class UniqueTest {
    public static void main(String[] args) {

        int[] arr = {2,6,6,3,2,5,2,9,9,3};
        //should be = {2,3,5,6,9}

        Arrays.sort(arr);
        int L = arr.length;
        int j = 0;

        for (int i = 0; i < L-1; i++) {

            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[L-1];

        for (int k = 0; k < j; k++)
            System.out.println(arr[k]);

    }
}
