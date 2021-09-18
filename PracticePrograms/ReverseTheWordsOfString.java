package PracticePrograms;

public class ReverseTheWordsOfString {

	public static void main(String[] args) {

		//INPUT-I work in exilant
		//output-I krow ni tnalixe;
         String s="I work in exilant";		
 String Rev="";
         String[] sa=s.split(" ");
         for(String s1:sa)
         {
        	 StringBuilder sb= new StringBuilder();
        	 sb.append(s1);
        	 sb.reverse();
        	 Rev=Rev+" "+sb;
         }
         System.out.println(Rev);
         System.out.println(Rev.trim());
	}

}
