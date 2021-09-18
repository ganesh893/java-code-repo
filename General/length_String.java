package General;

public class length_String {

	public static void main(String[] args) {
		
		String name="GaneshPandurangPatkal";
	//	System.out.println(name.length());
		char[] strchar=name.toCharArray();
		int length=0;
		for(char c:strchar)
		{
			System.out.println(c);
			length++;
		}
System.out.println(length);
	}

}
