class Test extends Object{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=10;
		Test t1=new Test();
		Test t2=new Test();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(a==b);
		System.out.println(a==c);
	}
}