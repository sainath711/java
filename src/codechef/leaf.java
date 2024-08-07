package codechef;

import java.util.Scanner;

//Lucky Clover
//Chef heard that four-leaf clovers bring good luck, so he went looking for one.
//
//In his search, Chef found
//N
//N clovers in total. Out of them, exactly one was a four-leaf clover, and all the others were three-leaf clovers.
//How many leaves did Chef collect in total, across all the clovers?
//
//Input Format
//The only line of input will contain a single integer
//N
//N, the number of clovers Chef found.
//
//Output Format
//Print one integer: the total number of leaves Chef collected.
public class leaf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(3*(N-1)+4);
    }
}
