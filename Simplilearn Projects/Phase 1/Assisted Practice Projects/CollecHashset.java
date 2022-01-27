import java.util.*;
import java.util.HashSet;

public class CollecHashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("is");
        hs.add("a");
        hs.add("Programming");
        hs.add("Language");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

	}

}
}