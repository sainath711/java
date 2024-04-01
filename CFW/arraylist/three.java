import java.util.ArrayList;	
class Test{
	public static void main(String[] args){
		ArrayList<Integer> ids=new<Integer> ArrayList();
		ids.add(10);
		ids.add(20);
		ids.add(30);
		ids.add(40);
		ids.add(50);
		ids.add(2,23);
		 ArrayList ids1=new ArrayList();
		 ids1.add(1);
		 ids1.add(2);
		 ids1.add(3);
		 ids1.add(4);
		 ids1.add(5);
			System.out.println(ids);
				System.out.println(ids1);
				ids.addAll(ids1);
				System.out.println(ids);
				
				System.out.println(ids.get(0));
						

	}
}