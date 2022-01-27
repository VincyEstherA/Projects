
public class Strings {

	public static void main(String[] args) {
		String str= "Java Program";
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		StringBuilder sbl = new StringBuilder(str);
		sbl.append(" For String Conversion");
		System.out.println(sbl);

	}

}
