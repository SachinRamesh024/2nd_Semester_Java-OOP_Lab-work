public class ArrMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3, 8};
        int size = arr.length;
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) { // Start from 1 since min is already arr[0]
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);


        for (int i = 1; i < size; i++) { // Start from 1 since min is already arr[0]
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);

    }
}
