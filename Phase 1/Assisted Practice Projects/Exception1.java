class Main extends Exception1{
	String str1;
	Main(String str2){
		str1=str2;
	}
	public String toString()
	{
		return("MyException Occurred:"+str1);
	}
}
public class Exception1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Starting of try block");
			throw new ArithmeticException("This is my error Message");
		}
		catch(ArithmeticException exp)
		{
			System.out.println("Catch Block");
			System.out.println(exp);
		}

	}

}
