package scp;

 class p {
}
class c extends p{}
class Test{
    public static void main(String[] args) {
        String s1="Rahul";
        String s2=new String("Rahul");
        StringBuffer s3=new StringBuffer("Rahul");
        String s4=new String("Rahul");
        p p1=new p();
        c c1=new c();


        int a=100;
        int b=200;
        System.out.println(p1==c1);
        System.out.println(s1== s2);

        //there is no relation btwn string and stringbuffer in s3 and s4
        //System.out.println(s3== s4);

        System.out.println(p1.equals(c1));
        System.out.println(s1.equals(c1));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

    }
}

