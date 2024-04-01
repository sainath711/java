import java.util.LinkedList;
import java.util.Iterator;
class Test2{
    public static void main(String[] args){
        LinkedList<Integer> enames=new<Integer> LinkedList();
        enames.add(100);
        enames.add(200);
        enames.add(300);
        enames.add(500);
        enames.add(400);
        // System.out.println(enames);
        Iterator itr=enames.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        System.err.println("o");
    }
}