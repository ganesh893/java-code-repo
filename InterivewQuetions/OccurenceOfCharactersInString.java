package InterivewQuetions;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		
		String s="Ganesh patkal";
		
		char[] c= s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			count=0;
			for(int j=i;j>=0;j--)
			{
				if(c[i]==c[j])
				{
					count =count+1;
				}
			}
			//if(count>1&&c[i]!='0')
		//	{
				System.out.println("the character :"+c[i]+"  is present :"+count+": Number of times");
			//}
		//	else
			
		}
		

	}

}
