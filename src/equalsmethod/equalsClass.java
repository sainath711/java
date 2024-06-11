package equalsmethod;

 class equalsClass {}
 class equalClass2 extends equalsClass{}
        class equalClass3{
    public static void main(String[] args) {
        equalsClass e1=new equalsClass();


        equalClass2 e2=new equalClass2();

        //for objects equal method() ad Operator(==) both for reference comparision
        System.out.println(e1.equals(e2));//false
        System.out.println(e1==e2);//false


    }
}
