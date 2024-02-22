class Test{
	int a=10;
	int b=20;
	public static void main(String[] args){
		 Test a1=new Test();
	System.out.println(a1.a);
		Test b1=new Test();
	System.out.println(b1.b);
	System.out.println(a1.a+b1.b);
	a1.a=20;
	System.out.println(a1.a);
	System.out.println(a1.a+b1.b);
	}
}