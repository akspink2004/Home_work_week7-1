package homework_week4;
//     6. A school has following rules for grading system:
//        a. Below 25 - F
//        b. 25 to 45 - E
//        c. 45 to 50 - D
//        d. 50 to 60 - C
//        e. 60 to 80 - B
//        f. Above 80 - A
//        Ask user to enter marks and print the corresponding grade.
import java.util.Scanner;
public class Prog6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A value : ");
        int a = Sc.nextInt();

        if (a <= 25) {
            System.out.println("   Grade       :     F   ");
        } else if (a >= 25 && a <= 45){
            System.out.println("    Grade       :    E   ");
        } else if (a >= 45 && a <= 50 ) {
            System.out.println("   Grade       :     D   ");
        } else if (a >= 50 && a <= 60) {
            System.out.println("   Grade       :     C   ");
        }else if (a >= 60 && a <= 80){
            System.out.println("   Grade       :     B   ");
        }else if ( a >= 80){
            System.out.println("   Grade       :     A   ");
        } else {
            System.out.println(" Fail ");

        }
    }

}
