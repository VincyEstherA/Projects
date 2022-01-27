import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		  
        // Use add() method to add elements in the Stack
        stack.add("Java");
        stack.add("Programming");
        stack.add("Language");
        stack.add("10");
        stack.add("20");
  
        // Output the Stack
        System.out.println("Stack: " + stack);
  
        // Remove the element using remove()
        String rem_ele = stack.remove(4);
  
        // Print the removed element
        System.out.println("Removed element: "
                           + rem_ele);
  
        // Print the final Stack
        System.out.println("Final Stack: "
                           + stack);

	}

}
