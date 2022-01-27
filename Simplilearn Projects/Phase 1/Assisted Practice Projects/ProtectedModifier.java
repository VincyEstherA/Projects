class Modifier
{
	protected void display()
	{
		System.out.println("Protected Access Specifier");
	}
}
public class ProtectedModifier extends Modifier {

	public static void main(String[] args) {
		ProtectedModifier obj=new ProtectedModifier();
		obj.display();

	}

}
