package Exceptionhandling;

public class checkArray {
    public static void main(String[] args) {
        int[] ids={101,102,103};
        System.out.println(ids[0]);
        try {
            System.out.println(ids[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(ids[1]);
        }

        System.out.println(ids[2]);
    }
}
