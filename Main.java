import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
    }
  }

import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a radius of the circle: ");
        int num = in.nextInt();
        double area = 3.14 * (num*num);
        System.out.println(area);
        }
}

