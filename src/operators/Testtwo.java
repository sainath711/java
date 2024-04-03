package operators;

class Testtwo{
	public static void main(String[] args){
	int a =1;
	int	b =2;
	int c =a++; 	//post increment:assign the value then increment
	System.out.println(a);  //2
	System.out.println(b);  //2
	System.out.println(c);  //1
	}
}