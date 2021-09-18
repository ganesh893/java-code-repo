package General;



public class StringCheck{
public static void main(String[] args)
{
	String  str="i am ganesh i am ganesh i";
	String[] words=str.split(" ");
	int count;

	for(int i=0;i<words.length;i++)
	{
		count=1;
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
				count++;
				words[j]="0";
			}
		}
		if(count>1&&words[i]!="0")
		{
			System.out.println(words[i]);
			System.out.println(count);

		}
	}
}
}
