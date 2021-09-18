package InterivewQuetions;

public class MakeFewCharactersUpperCase {

	public static void main(String[] args) {
		
		String s="ganesh";
		//s=s.toUpperCase();
		System.out.println(s);
		char[] ca=s.toCharArray();
		for(char c:ca)
		{
			if(c=='a')
			{
				c=Character.toUpperCase(c);
				//System.out.print(Character.toUpperCase(c));
			}
		}
		System.out.println(ca.toString());
	}

}
