class MyException extends Exception{
public MyException(String s)
	{
		super();
		
	}
}
public class Exception {
	
	public static void main(String[] args) {
		try
		{
			throw new ArithmeticException("temp");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}

	}

}
