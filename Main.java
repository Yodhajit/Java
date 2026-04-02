// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter name: ");
//         String name = input.nextLine();
//         System.out.println("Hello " + name + "!");
//     }
//   }

// import java.util.Scanner;
// public class area_circle {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.printf("Enter a radius of the circle: ");
//         int num = in.nextInt();
//         double area = 3.14 * (num*num);
//         System.out.println(area);
//         }
// }

// import java.util.Scanner;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
        
//         int num = in.nextInt();
//         int current = num, temp = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             temp = temp * 10 + digit;
//             num /= 10;
//         }

//         if (current == temp)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }
// Leet code problem-
// class Solution {
//     public boolean isUgly(int n) {

//         if (n <= 0) {
//             return false;
//         }

//         while (n % 2 == 0) {
//             n = n / 2;
//         }

//         while (n % 3 == 0) {
//             n = n / 3;
//         }

//         while (n % 5 == 0) {
//             n = n / 5;
//         }
//         return n == 1;
//     }
// }

// import java.util.Scanner;
// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         int original = num;
//         int reversed = 0;
        
//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }
        
//         System.out.println("Original number: " + original);
//         System.out.println("Reversed number: " + reversed);
//     }
// }
//using functions

class Solution {
    public static boolean isArmstrong(int n) {

        int original = n;
        int count = 0;
        int temp = n;

        // Step 1: count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = n;

        // Step 2: calculate sum of powers
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}



