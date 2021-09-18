package General;

public class DuplicateinString {

	public static void main(String[] args)
	{
	String s="ganesh is a common man ganesh is ganesh patkal and patkal";
	
	String[] words=s.split(" ");
	System.out.println(words.length);
	int counter;
	
	for(int i=0;i<words.length;i++)
	{
		counter=1;
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
				counter++;
				//System.out.println(words[j]);
				words[j]="";
				//System.out.println(words[j]);
			}
		}
		if(counter>1&&words[i]!="")
		{
			System.out.println("the repeated word is :"+words[i]+" :"+counter);
			words[i]="";
		}
	}
	
}
	
}
