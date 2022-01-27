import java.util.LinkedList;

public class CollecLinkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
			li.add(i);
		System.out.println(li);
		li.remove(3);
		System.out.println(li);
		for(int i=0;i<li.size();i++)
			System.out.print(li.get(i)+" ");
		

	}

}
