class Test{
	public static void main(String[] args){
	String[] ename={"sai","sai2"};
		System.out.println(ename[0]);
		
		try{
			
		System.out.println(ename[2]);
		}
		catch(Exception e){
			System.out.println(ename[1]);
			
		}
	}
}