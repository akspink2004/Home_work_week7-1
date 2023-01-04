package homework_week4;
/*8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        int a = 100;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of class" +a);
        System.out.println("Enter number of attended");
        int b = Sc.nextInt();
        double per =( b * 100)/a;
        if ( per>=75){
            System.out.println("Sudent allow to sit in exam");
        }else {
            System.out.println("Student not allow to sit in exam");
        }

    }
}
