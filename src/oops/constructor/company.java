package oops.constructor;

class company{
	int emp_id;
	String emp_name;
	int emp_salary;
	company(int emp_id,String emp_name,int emp_salary){
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.emp_salary=emp_salary;
	}
	public static void main(String[] args){
	company c1=new company(101,"shiva",10000);
	System.out.println(c1.emp_id);
	System.out.println(c1.emp_name);
	System.out.println(c1.emp_salary);
	}
}