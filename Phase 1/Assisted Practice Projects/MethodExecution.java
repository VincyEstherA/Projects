
public class MethodExecution {
	public int multiplynumbers(int a,int b)
	{
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		MethodExecution b=new MethodExecution();
		int ans =b.multiplynumbers(10, 3);
		System.out.println("Multiplication is:"+ans);

	}

}
