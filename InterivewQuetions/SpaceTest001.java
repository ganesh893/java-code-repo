package InterivewQuetions;

public class SpaceTest001 {

	public static void main(String[] args) {
		String s="India is my country";

		char[] input=s.toCharArray();
		char[] res=new char[input.length];

		for(int i=0;i<input.length;i++)
		{
			if(input[i]==' ')
			{
				res[i]=' ';
			}
		}
		
		int j=res.length-1;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]!=' ')
			{
				if(res[j]==' ')
				{
					j--;
				}
				res[j]=input[i];
				j--;
			}
		}
		System.out.println(s+"--->"+String.valueOf(res));
	}

}
