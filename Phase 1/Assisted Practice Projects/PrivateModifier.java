class Data
{
	private String name;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class PrivateModifier {

	public static void main(String[] args) {
		Data d=new Data();
		d.setName("Private Access Modifier");
		System.out.println(d.getName());

	}

}
