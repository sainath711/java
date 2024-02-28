class School{
	int Student_id;
	String Student_name;
	School(int Student_id,String Student_name){
	this.Student_id=Student_id;
	this.Student_name=Student_name;
	}
	public static void main(String[] args){
	School S1=new School(42,"sai");
	System.out.println(S1.Student_id);
	System.out.println(S1.Student_name);
	}
}
