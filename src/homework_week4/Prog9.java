package homework_week4;
//    9.  Modify the above question to allow student to sit if he/she has medical cause. Ask
//        user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.Scanner;
public class Prog9 {
        public static void main(String[] args) {
            int a = 100;
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter number of class :  " +a);
            System.out.println("Enter number of attended");
            int b = Sc.nextInt();
            double per =( b * 100)/a;
            if ( per>=75){
                System.out.println("Student allowed to sit in exam");
            }else {
                System.out.println("Student not allow to sit in exam");
            }
            if ( per < 75) {
                System.out.println("is it any medical cause");
                System.out.println("y : Yes");
                System.out.println("N : No");
                char d = Sc.next().charAt(0);
                switch (d) {
                    case 'Y':
                        System.out.println("student is allowed to sit in exam");
                        break;
                    case 'N':
                        System.out.println("Student is not allowed to sit in exam");
                        break;
                    default:
                        System.out.println("Invalid");
                }
            }
        }
}




