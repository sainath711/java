package oops;

class employee1 extends employee {
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

	}
}