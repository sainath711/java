package lang;

class Test{
	public static void main(String[] args){
		int a=10;
		Integer i=a;
		//Integer i=Integer.valueOf(a);
		Float f=Float.valueOf(i);
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(f);
	}
}