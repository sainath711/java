package java8.lamda;

interface Dao{
public abstract void login();
}
class Daoimpl{
	public static void main(String[] args){
		
		Dao obj=()->{ System.out.println("login successfully");};
		obj.login();
	}
		
	}