package codechef;


import java.util.Scanner;

public class counting {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int P1=sc.nextInt();
        int P2=sc.nextInt();
        int P3=sc.nextInt();
        int P4=sc.nextInt();
        int P5=0;
        if(P1>=10)P5++;
        if(P2>=10)P5++;
        if(P3>=10)P5++;
        if(P4>=10)P5++;
        System.out.println(P5);
    }

}
