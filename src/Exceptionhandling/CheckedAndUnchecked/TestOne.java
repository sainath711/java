package Exceptionhandling.CheckedAndUnchecked;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestOne {
    //Checked
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("TestOne.text");
            System.out.println("GM");
        }
        catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }

        try {
            PrintWriter pe = new PrintWriter("TestOne.text");
            System.out.println("GN");
        }
        catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }

    }
}
