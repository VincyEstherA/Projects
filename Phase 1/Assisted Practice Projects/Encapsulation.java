class Encapsulate {
    private String stuName;
    private int stuRoll;
    private int stuAge;
    public int getAge() { return stuAge; }
    public String getName() 
    { 
    	return stuName; 
    }
    public int getRoll()
    { 
    	return stuRoll; 
    }
    public void setAge(int newAge)
    { 
    	stuAge = newAge; 
    }

    public void setName(String newName)
    {
        stuName = newName;
    }
    public void setRoll(int newRoll) 
    { 
    	stuRoll = newRoll; 
    }
}
public class Encapsulation {

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
        System.out.println("student name: " + obj.getName());
        System.out.println("student age: " + obj.getAge());
        System.out.println("student roll: " + obj.getRoll());
	}

}
