abstract class Test{
	abstract void m1();
	
		
	void m2(){}
	
}
	class Testimpl extends Test{
		void m1(){}
		public static void main(String[] args){
		System.out.println("hi");
		new Testimpl();
	}
	}