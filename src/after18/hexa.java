package after18;
//no method soo by default object class tostring is going to be execute
 class a {

}
class B extends a{

}
class one{
    public static void main(String[] args) {
       B obj=new B();
        System.out.println(obj);
        System.out.println(obj.toString());
        //checking the object class methods
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
    }
}
