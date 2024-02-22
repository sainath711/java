class Test{
	int a=20;//instance variable
	static int b=30;//static variable
	public static void main(String[] args){
	int c=40;//local variable
	Test a1=new Test();
	System.out.println(a1.a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(a1.a+b+c);
	}
}