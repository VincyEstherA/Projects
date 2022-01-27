
public class ParameterizedCons {
	String languages;
	ParameterizedCons(String lang)
	{
		languages=lang;
		System.out.println(languages + " Programming Language");
	}

	public static void main(String[] args) {
		ParameterizedCons obj1 = new ParameterizedCons("Java");
		ParameterizedCons obj2 = new ParameterizedCons("Python");
		ParameterizedCons obj3 = new ParameterizedCons("C");

	}

}
