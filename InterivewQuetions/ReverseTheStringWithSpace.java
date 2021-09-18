package InterivewQuetions;

public class ReverseTheStringWithSpace {

	public static void main(String[] args) {

		String s="India Is my country";
		char[] inputString=s.toCharArray();
		char[] re=new char[inputString.length];
		
		System.out.println(re.length);
		//System.out.println(String.valueOf(re));
		for(int i=0;i<inputString.length;i++)
		{
			if(inputString[i]==' ')
			{
				re[i]=' ';
			}
		}
		System.out.println(re.length);
	
		int j=re.length-1;
		
		for(int i=0;i<inputString.length;i++)
		{
			if(inputString[i]!=' ')
			{
				if(re[j]==' ')
				{
					j--;
				}
				re[j] = inputString[i];  
	            j--;  
			}
			
		}
		 System.out.println(s + " --> " + String.valueOf(re));  

	}

}
