import java.util.*;
public class CollecLinkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<String>lhs=new LinkedHashSet<String>();
		
		lhs.add("Java");
        lhs.add("is");
        lhs.add("a");
        lhs.add("Programming");
        lhs.add("Language");
  
        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}

}
