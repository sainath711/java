package parameters;

public class fullName {
    static void m1(String firstName){//Here firstName is called parameter
        System.out.println(firstName + " Dasari");
    }

    public static void main(String[] args) {
        m1("Rangaswamy");// after naming an parameter it is known as argument
        m1("Janaki");
        m1("Ramani");
        m1("Sainath");
    }

}
