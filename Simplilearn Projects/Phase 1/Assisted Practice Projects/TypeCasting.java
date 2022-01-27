
public class TypeCasting {

	public static void main(String[] args) {
		//implicit conversion
		
		
				System.out.println("Implicit Type Casting");
				
				byte b=115;
			 
			               	System.out.println("Value of b: "+b);
				short s=b;
			
				            System.out.println("Value of s: "+s);
				
				int i=s;
				             System.out.println("Value of i: "+i);
				long l=i;
			
				           System.out.println("Value of l: "+l);
				float f=l;
				
			               	System.out.println("Value of f: "+f);
				double d=f;
				          	System.out.println("Value of d: "+d);
						
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
		//explicit conversion
				
				double d1=115.77;
				       	System.out.println("Value of d1: "+d1);
				float f1=(float)d1;
				         	System.out.println("Value of f1: "+f1);
	
	}

}
