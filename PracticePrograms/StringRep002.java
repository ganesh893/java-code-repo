package PracticePrograms;

public class StringRep002 {

	public static void main(String[] args) {

		String s="ganesh ganesh patkal pandurang patkal";

		String[] words=s.split(" ");
		int count=0;
		for(int i=0;i<words.length-1;i++)
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
			if(count>=2&&words[i]!="0")
				System.out.println(count+" "+words[i]);
		}

	}

}
