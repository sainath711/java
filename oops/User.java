abstract class User{
	public abstract void emp();
}
 class employee extends User{
	 
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
		
	   
	public void emp(){
	}
}
 class permanent_emp extends employee{
	 
	private int emp_savings;
	private int emp_expenses;
	public  int getemp_savings(){
		return emp_savings;
	}
	public void setemp_savings(int emp_savings){
	this.emp_savings=emp_savings;
	}
	
	public  int getemp_expenses(){
		return emp_expenses;
	}
	public void setemp_expenses(int emp_expenses){
	this.emp_expenses=emp_expenses;
	}
	 public void emp(){
		
		double bal=this.getemp_salary()-this.getemp_expenses();
		System.out.println(this.getemp_name()  +  this.getemp_id()+" emp bal is:"+bal);
	 }
	 

}
 class temporary_emp extends employee{
	 
	 private int emp_savings;
	 private int emp_expenses;
	 public  int getemp_savings(){
		return emp_savings;
	}
	public void setemp_savings(int emp_savings){
	this.emp_savings=emp_savings;
	}
	 public int getemp_expenses(){
		 return emp_expenses;
	 }
	 public void setemp_expenses(int emp_expenses){
		 this.emp_expenses=emp_expenses;
	 }
	 public void emp(){
		 double emp=this.getemp_salary()-this.getemp_expenses();  
		System.out.println(this.getemp_name() +  this.getemp_id()+" emp bal is:"+emp);
	 }
		 
	 
}
class Demo{
	public static void main(String[] args){
		
		permanent_emp e1=new permanent_emp();
		e1.setemp_id(116);
		e1.setemp_name("khanna");
		e1.setemp_salary(20000);
		e1.setemp_savings(10000);
		e1.setemp_expenses(5000);
		e1.emp();
		
		temporary_emp e2=new temporary_emp();
		e2.setemp_id(102);
		e2.setemp_name("pampa");
		e2.setemp_salary(30000);
		e2.setemp_savings(10000);
		e2.setemp_expenses(6000);
		e2.emp();
		
	}
}






 