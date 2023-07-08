
package july8;
import java.util.Scanner;
public class july_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1");
        int a = sc.nextInt();

        Scanner sb = new Scanner(System.in);
        System.out.println("input 2");
        int b = sb.nextInt();

        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for *");
        System.out.println("4 for /");

        Scanner option = new Scanner(System.in);
        System.out.println("choose option");
        int c = option.nextInt();

        if(c==1)  {
            System.out.println(a+b);
        }
        if(c==2) {
            System.out.println(a-b);
        } if(c==3)  {
            System.out.println(a*b);
        } if(c==4)  {
            System.out.println(a/b);
            }
        }
    }

