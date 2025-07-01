import java.util.*;

class For_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // 1. Write a program to print all natural numbers from 1 to n
        // for(int i=1;i<=n;i++){
        // System.out.print(i+" ");
        // }

        // 2. Write a program to print all natural numbers in reverse
        // for(int i=n;i>=1;i--){
        // System.out.print(i+" ");
        // }

        // 3. Write a program to print tables
        // for(int i=1;i<=10;i++){
        // int value=n*i;
        // System.out.println(n+"x"+i+"="+value);
        // }

        // 4. Write a program to print reverse tables
        // for(int i=10;i>=1;i--){
        // int value=n*i;
        // System.out.println(n+"x"+i+"="+value);
        // }

        // 5. Write a program to print all alphabets from a to z
        // char alpahabet;
        // for (alpahabet='a';alpahabet<='z';alpahabet++){
        // System.out.print(alpahabet+" ");
        // }

        // 6. Write a program to print reverse alphabets from Z to A
        // for(char alphabets='z';alphabets>='a';alphabets--){
        // System.out.print(alphabets+" ");
        // }

        // 7. Write a program to print all even numbers between 1 to 100
        // for(int i=1;i<=100;i++){
        // if(i%2==0){
        // System.out.print(i+" ");
        // }
        // }

        // 8. Write a program to print all odd number between 1 to 100
        // for(int i=1;i<=100;i++){
        // if(i%2!=0){
        // System.out.print(i+" ");
        // }
        // }

        // 9. Write a program to find sum of all natural numbers between 1 to n
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // if (i > 1 && i <= n) {
        // System.out.print("+");
        // }
        // System.out.print(i);
        // sum = sum + i;
        // }
        // System.out.println("\n" + sum);

        // 10. Write a program to find sum of all even numbers between 1 to n
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // sum = sum + i;
        // System.out.print(i);
        // } else if (i > 1 && i < n) {
        // System.out.print("+");
        // }
        // }
        // System.out.println("\n" + sum);

        // 11. Write a program to find sum of all odd numbers between 1 to n
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 != 0) {
        // sum = sum + i;
        // System.out.print(i);
        // } else if (i > 1 && i < n) {
        // System.out.print("+");
        // }
        // }
        // System.out.println("\n" + sum);

        // 12. Write a program to print the ASCII values
        for (int i = 1; i <= 255; i++) {
            System.out.println((char) i);
        }
    }
}