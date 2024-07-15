package BiFunction;

interface ex1 {
    public abstract int apply(String fname,String lname);
}
class eximpl implements ex1{
    @Override
    public int apply(String fname, String lname) {
        return (fname+lname).length();
    }

    public static void main(String[] args) {
        ex1 obj=new eximpl();
        System.out.println(obj.apply("Rahul","gandhi"));
    }
}
