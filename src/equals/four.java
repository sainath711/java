package equals;
class four{
	public static void main(String[] args){
		String s1="sai";
		String s2=new String("sai");
		String s3="nath";
		four t1=new four();
		four t2=new four();
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//false
	}
}