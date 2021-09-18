package InterivewQuetions;

public class SingleToneClass {

	private static SingleToneClass Instance_Single=null;
	String s;
	private SingleToneClass()
	{
		s="private counstructor of single tone class";
	}
	public static SingleToneClass abc() 
	{
		Instance_Single=new SingleToneClass();
		return Instance_Single ;
	}
	
	public static void main(String[] args) {

		SingleToneClass x= new SingleToneClass();
		SingleToneClass y= new SingleToneClass();
		SingleToneClass z= new SingleToneClass();
		System.out.println("Hashcode of x is "
                + x.hashCode());
System.out.println("Hashcode of y is "
                + y.hashCode());
System.out.println("Hashcode of z is "
                + z.hashCode());
	}

}
