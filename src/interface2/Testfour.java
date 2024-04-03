package interface2;
interface Testfour{
	void m1();
	void m2();
	public void m3();
}
class Testimpl implements Testfour{
	public void m1(){
		System.out.println("testimpl implements m1 method");
	}
	public void m2(){
	    System.out.println("testimpl implements m2 method");
	}
	public void m3(){
		System.out.println("testimpl implements m3 method");
	}
	
	
}
class Demo{
public static void main(String[] args){
	Testimpl t1=new Testimpl();
	t1.m1();
	t1.m2();
	t1.m3();
}
}
