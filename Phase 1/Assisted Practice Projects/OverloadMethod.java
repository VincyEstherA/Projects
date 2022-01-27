
public class OverloadMethod {
	public void area(int b,int h)
	{
		System.out.println("Area of Triangle:"+(0.5*b*h));
	}
	public void area(int r)
	{
		System.out.println("Area of circle:"+(3.14*r*r));
	}

	public static void main(String[] args) {
		OverloadMethod obj=new OverloadMethod();
		obj.area(10,12);
		obj.area(5);

	}

}
