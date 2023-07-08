package july8;

import java.util.Scanner;

public class switch_char {
    public static void main(String[] args) {

        Scanner sa = new Scanner(System.in);
        System.out.println("search for place (Pragra or cn tower)");
        String a = sa.next();

        switch(a){
            case "pragra":
                System.out.println(
                        "125 Topflight Drive, Unit-202, Mississauga ON L5S 1Y1"
                );
                break;
        }
        switch(a){
            case "cn tower":
                System.out.println("toronto");
                break;
        }

    }
}
