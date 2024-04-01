import java.util.ArrayList;
class Test{
	public static void main(String[] args){
		ArrayList ename=new ArrayList();
		System.out.println(ename);
		ename.add(100);
		System.out.println(ename);
		ename.add("Sai");
		ename.add("mani");		
		System.out.println(ename);
		ename.remove(1);
		System.out.println(ename);
		ename.add("sai");
		System.out.println(ename);
		System.out.println(ename.contains("sainath"));
		System.out.println(ename.size());
		ename.clear();
		System.out.println(ename.isEmpty());
		System.out.println(ename);
		
	}
}

