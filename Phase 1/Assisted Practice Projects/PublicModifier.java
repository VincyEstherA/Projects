class PubModifier
{
	public void display()
	{
		System.out.println("Public Access Specifier");
	}
}
public class PublicModifier extends PubModifier{

	public static void main(String[] args) {
		PublicModifier obj=new PublicModifier();
		obj.display();

	}

}
