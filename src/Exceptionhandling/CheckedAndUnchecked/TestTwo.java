package Exceptionhandling.CheckedAndUnchecked;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestTwo {
    //Unchecked exceptions
    public static void main(String[] args)throws FileNotFoundException{

            PrintWriter pw = new PrintWriter("TestOne.text");
            System.out.println("GM");

    }

}
