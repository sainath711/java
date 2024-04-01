class employee extends Object{
	public String toString(){
		return "sai";
	}
	public static void main(String[] args){
	employee e1=new employee();
	System.out.println(e1);
	System.out.println(e1.toString());
	String s1="sai";
	String s2="sai";
	System.out.println(s1.equals(s2));
	String s3=new String("sai");
	System.out.println(s2.equals(s3));
	String s4="sainath";
	System.out.println(s3.equals(s4));
	System.out.println(s3==(s4));
	
	}
}

