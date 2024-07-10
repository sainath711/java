package exceptions;

class  Testthree3{//null pointer exception
	public static void main(String[] args){
	try{
	String ename=null;//"sai";
	System.out.println(ename.length());
	}
	catch(Exception e){
		String ename="sai";
	System.out.println(ename.length());
	}
	
	}
}