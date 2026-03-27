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

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();
        int current = num, temp = 0;

        while (num > 0) {
            int digit = num % 10;
            temp = temp * 10 + digit;
            num /= 10;
        }

        if (current == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
