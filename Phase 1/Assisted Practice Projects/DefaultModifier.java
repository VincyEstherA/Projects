public class DefaultModifier {
	void display() 
    { 
        System.out.println("This is the default access modifier"); 
    } 
	public static void main(String[] args) {
		//default
				System.out.println("Dafault Access Modifier");
				DefaultModifier obj = new DefaultModifier(); 		  
		        obj.display(); 

}
}

