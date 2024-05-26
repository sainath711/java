package roman;

import java.util.Scanner;

//i=1
//v=5
//x=10
//l=50
//c=100
//d=500
//m=1000
public class one {
    public static void main(String[] args) {

//        String a="c";
        System.out.println("enter the input:");

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals("i")) {
            System.out.println("1");

        } else if (a.equals("v")) {
            System.out.println("5");
        } else if (a.equals("x")) {
            System.out.println("10");
        } else if (a.equals("l")) {
            System.out.println("50");
        } else if (a.equals("c")) {
            System.out.println("100");
        } else if (a.equals("d")) {
            System.out.println("500");
        } else if (a.equals("m")) {
            System.out.println("1000");
        } else {
            System.out.println("wrong");
        }
    }
}
