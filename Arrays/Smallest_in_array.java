//smallest number inthe array
public class Smallest_in_array {
    public static void main(String[] args) {
        int arr[] = { 0, 7, 25, 2, 9, 4, 4 };
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println(small);
        // for (int element : arr) {
        // System.out.println(element);
        // }
    }
}
