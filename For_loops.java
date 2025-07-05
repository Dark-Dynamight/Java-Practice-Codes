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
        // for (int i = 1; i <= 255; i++) {
        // System.out.println((char) i);
        // }

        // 13. Write a program to find the factorial value of any number
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact = fact * i;
        // }
        // System.out.print(fact);

        // 14. Write a program to find the value of one number raised to the power of
        // another
        // System.out.println("base");
        // int base = sc.nextInt();
        // System.out.println("power");
        // int power = sc.nextInt();
        // int result = 1;
        // for (int i = 1; i <= power; i++) {
        // result *= base;
        // }
        // System.out.println(result);

        // 15. write a program to reverse the given Digits
        // int n = sc.nextInt();
        // int rem = 0, rev = 0;
        // while (n > 0) {
        // rem = n % 10;
        // rev = rev * 10 + rem;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // 16. write a program to sum of its Digits
        // int n = sc.nextInt();
        // int rem = 0, rev = 0;
        // while (n > 0) {
        // rem = n % 10;
        // rev = rev + rem;
        // n = n / 10;
        // }
        // System.out.println(rev);

        // 17. write a program to Check Whether a Given Number is Prime or Not
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if (count <= 2) {
        // System.out.println("Is prime");
        // } else {
        // System.out.println("not prime");
        // }

        // 18. Write a program to calculate HCF of Two given number
        // int dividend = 91, divisor = 31;
        // int rem, hcf = 0;
        // do {
        // rem = dividend % divisor;
        // if (rem == 0) {
        // hcf = divisor;
        // } else {
        // divisor = rem;
        // dividend = divisor;
        // }
        // } while (rem != 0);
        // System.out.println(hcf);

        // 19. Write a program to enter the numbers till the user wants and at the end
        // it should display the count of positive, negative and zeros entered
        // System.out.println("enter number of input numbers");
        // int n = sc.nextInt();
        // System.out.println("enter numbers");
        // int num;
        // int postive = 0;
        // int negitive = 0;
        // int zero = 0;
        // for (int i = 0; i <= n; i++) {
        // num = sc.nextInt();
        // if (num < 0) {
        // negitive++;
        // } else if (num > 0) {
        // postive++;
        // } else {
        // zero++;
        // }
        // }
        // System.out.println("Postive: " + postive + " negitive: " + negitive + " zero:
        // " + zero);

        // 20. Write a program to enter the numbers till the user wants and at the end
        // the program should display the largest and smallest numbers entered
        do {

        } while (option == 'y' && 'Y');
    }
}