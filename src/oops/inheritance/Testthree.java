package oops.inheritance;

//multilevel inheritance
class parent1{
	public void m1(){
	System.out.println("parent class m1 method");
	}
	public void m2(){
		System.out.println("parent class m2 method");
	}
}
class parent2 extends parent1{
	public void m3(){
		System.out.println("parent1 class m3 method");
	}
}
class child2 extends parent2{
	public void m4(){
		System.out.println("child class m4 method");
	}
}

class Demo1{
	public static void main(String[] args){
		 child2 c1=new child2();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
	}
}