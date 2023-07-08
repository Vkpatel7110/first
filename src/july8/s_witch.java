package july8;

import java.util.Scanner;

public class s_witch {

    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);
        System.out.println("input 1");
        int a = sa.nextInt();

        Scanner sb = new Scanner(System.in);
        System.out.println("input 2");
        int b = sb.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");
        System.out.println("5 for %");
        int c = sc.nextInt();

        switch(c) {
            case 1:
                System.out.print("output = ");
                System.out.println(a+b);
            break;
        }

        switch(c) {
            case 2:
                System.out.print("output = ");
                System.out.println(a-b);
                break;
        }
        switch(c) {
            case 3:
                System.out.print("output = ");
                System.out.println(a*b);
                break;
        }
        switch(c) {
            case 4:
                System.out.print("output = ");
                System.out.println(a/b);
                break;
        }
        switch(c) {
            case 5:
                System.out.print("output = ");
                System.out.println(a%b);
                break;
        }

     }



}
