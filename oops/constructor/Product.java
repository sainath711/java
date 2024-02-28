class Product{
	int id;
	String Product_name;
	Product(int id,String Product_name){
	this.id=id;
	this.Product_name=Product_name;
	}
	public static void main(String[] args){
	Product P1=new Product(101,"Iphone");
	System.out.println(P1.id);
	System.out.println(P1.Product_name);
	}
}