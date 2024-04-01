import java.util.ArrayList;
class Test{
	public static void main(String[] args){
		ArrayList<String>a1=new<String>ArrayList();
		ArrayList<String>a2=new<String>ArrayList();
		a1.add("sai");
		a1.add("shiva");
		a1.add("raju");
		System.out.println(a1);
		a2.add(null);
		a2.add("fouqiya");
		a2.add("likitha");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);

		
	}
}