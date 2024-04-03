package oops.constructor;

class Test{
	int id;
	String name;
	int salary;
	Test(int id,String name,int salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	public static void main(String[] args){
	Test t1=new Test(101,"sai",1234);
	System.out.println(t1.id);
	System.out.println(t1.name);
	System.out.println(t1.salary);
	Test t2=new Test(102,"shiva",1230);
	System.out.println(t2.id);
	System.out.println(t2.name);
	Test t3=new Test(103,"raju",2345);
	System.out.println(t3.id);
	System.out.println(t3.name);
	
	}
}