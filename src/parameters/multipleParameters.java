package parameters;

public class multipleParameters {
    static void m1(String name,int age){
        System.out.println(name  +" Age is " +   age  );
    }

    public static void main(String[] args) {
        m1("Sai", 10);
        m1("Ramani",12);
        /*m1("Ramu");required: java.lang.String,int
                     found:    java.lang.String     */
    }
}
