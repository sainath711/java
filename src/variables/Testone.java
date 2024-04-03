package variables;

class Testone{
	static int emp_salary=20000;
			int emp_id;
			String emp_name;
	public static void main(String[] args){
	
	Testone t1=new Testone();
	t1.emp_id=101;
	t1.emp_name="shiva";
	System.out.println(t1.emp_id);
	System.out.println(t1.emp_name);
	System.out.println(t1.emp_salary);
	emp_salary=25000;
	System.out.println(t1.emp_salary);
	t1.emp_id=102;
	System.out.println(t1.emp_id);
	}
}