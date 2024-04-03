package equals;
class two extends Object{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=10;
		two t1=new two();
		two t2=new two();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		System.out.println(a==b);
		System.out.println(a==c);
	}
}