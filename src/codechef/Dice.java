package codechef;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // write your code here
            int z=6;
            if ((x+y)<=z){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
