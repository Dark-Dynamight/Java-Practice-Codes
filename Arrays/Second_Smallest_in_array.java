public class Second_Smallest_in_array {
    public static void main(String[] args) {
        int arr[] = { 5, 0, 4, 7, 3, 7, 2, 9 };
        int small = arr[0];
        int secondSmallest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                secondSmallest = small;
                small = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > small) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("smallest is " + small);
        System.out.println("second smallest is " + secondSmallest);
    }
}
