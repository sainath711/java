class Test{//ArrayIndexOutOfBoundsException
	public static void main(String[] args){
	int i[]={101,102,103};
	System.out.println(i[0]);
	try{
	System.out.println(i[5]);//i[1]
	}
	catch(Exception e){
	System.out.println(i[1]);	
	}
	System.out.println(i[2]);
	}
}