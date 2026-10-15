
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {15, 42, 8, 63, 27};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
