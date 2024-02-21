abstract class Test{
	public abstract void m1(); 
	
}
class Testimpl extends Test {
	public void m1(){
		System.out.println("Testimpl m1 method");
	}
}
class Demo{
public static  void main(String[] args){
	new Testimpl().m1();
	
}
}