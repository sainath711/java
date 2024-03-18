class Test{//exception handling
	public static void main(String[] args){
		System.out.println("GM");
		try{
	System.out.println(10/0);
	}
	catch(Exception e){
	System.out.println(10/1);
	}
	System.out.println("GE");
	}
}