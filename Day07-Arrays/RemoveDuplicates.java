
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        if (arr.length == 0) {
            System.out.println("Unique elements: 0");
            return;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        int uniqueCount = uniqueIndex + 1;

        System.out.println("Unique elements: " + uniqueCount);
        System.out.println("Array without duplicates: "
                + Arrays.toString(Arrays.copyOf(arr, uniqueCount)));
    }
}
