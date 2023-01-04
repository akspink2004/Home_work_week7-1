package homework_week4;
//     7. Take input of age of 3 people by user and determine oldest and youngest among
//        them.
import java.util.Scanner;
public class Prog7 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter First people age : ");
        int a = Sc.nextInt();
        System.out.print("Enter second people age : ");
        int b = Sc.nextInt();
        System.out.print("Enter Third people age : ");
        int c = Sc.nextInt();
        if (a < b && a < c ) {
            System.out.println("A is Youngest  ");
        } else if (b < a && b < c ) {
            System.out.println("B is Youngest ");

        } else if (c < a && c < b ) {
            System.out.println("C is Youngest ");

        }else {
            System.out.println("Same age");
        }


         if(a > b && a > c ){
            System.out.println(" A is Oldest   ");
        } else if (b > a && b > c ) {
            System.out.println(" B is Oldest  ");
        } else if (c > a && c > b) {
            System.out.println(" C is Oldest ");

        }else {
            System.out.println(" same age  ");
        }


    }
}
