package arrays;

class Testfour{//Arrayindexoutofbound exception
	public static void main(String[] args){
	int[] ids={101,102,103};
	String[] enames={"sai","raju","shiva"};
	System.out.println(ids[0]);
	System.out.println(ids[1]);
	System.out.println(ids[2]);
	try{
	System.out.println(ids[3]);
	}
	catch(Exception e){
		
	}
	System.out.println(enames[0]);
	System.out.println(enames[1]);
	System.out.println(enames[2]);
	}
}