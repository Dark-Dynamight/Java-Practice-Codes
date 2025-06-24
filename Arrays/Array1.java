
//take 5 numbers as input and print the five numbers in reverse order using array
import java.util.*;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter 5 inputs");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j]);
            if (j > 0) {
                System.out.print(",");
            }
        }
    }
}
