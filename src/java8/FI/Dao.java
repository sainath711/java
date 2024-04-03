package java8.FI;

interface Dao{
public abstract void login();
}
class Daoimpl implements Dao{
	public void login(){
		System.out.println("login successfully");
	}
}
class Test{
	public static void main(String[] args){
		Dao d=new Daoimpl();
		d.login();
	}
}