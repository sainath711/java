abstract class User1{
	public  abstract void m1();
}
 class employee extends User1{
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	 public int getemp_id(){
	 return emp_id;
	 }
	 public void setemp_id(int emp_id){
	 this.emp_id=emp_id;
	 }
	 public String getemp_name(){
	 return emp_name;
	 }
	 public void setemp_name(String emp_name){
	 this.emp_name=emp_name;
	 }
	 public double getemp_salary(){
		 return emp_salary;
	 }
	 public void setemp_salary(double emp_salary){
		 this.emp_salary=emp_salary;
	 }
	  public void m1(){
		 
}
}
class employee1 extends employee{
	private int emp_expenses;
	public int getemp_expenses(){
		return emp_expenses;
	}
	public void setemp_expenses(int emp_expenses){
		this.emp_expenses=emp_expenses;
	}
	public void m1(){
		double emp_salary=this.getemp_salary()-this.getemp_expenses();
		System.out.println("emp remaining salary is:"+emp_salary);
	}
	
}
class employee2 extends employee{
	private int emp_expenses;
	public int getemp_expenses(){
		return emp_expenses;
	}
	public void setemp_expenses(int emp_expenses){
		this.emp_expenses=emp_expenses;
	}
	public void m1(){
		double bal=this.getemp_salary()-this.getemp_expenses();
		System.out.println("emp remaining salary is:"+bal);
	}
	
}
	 class User2 {
	public static void m2(employee a) {//polymorphism
		a.m1();
	}
}
class Demo{
	public static void main(String[] args){
		employee1 e1=new employee1();
		e1.setemp_id(101);
		e1.setemp_name("sai");
		e1.setemp_salary(10000);
		e1.setemp_expenses(2000);
		e1.m1();
		employee2 e2=new employee2();
		e2.setemp_id(102);
		e2.setemp_name("khana");
		e2.setemp_salary(100000);
		e2.setemp_expenses(20000);
		e2.m1();
		User2.m2(e1);
		User2.m2(e2);
	}
}