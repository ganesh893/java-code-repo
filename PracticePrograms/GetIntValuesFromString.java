package PracticePrograms;

public class GetIntValuesFromString {

	public static void main(String[] args) {
		
		String s="dfdddf154 yuty 89";
		s=s.replaceAll("[^\\d]", "");
	    s=s.trim();
		s.replaceAll(" +", "");
		System.out.println(s);

		
		/*s.replaceAll("[^\\d]", " ");
		s=s.trim();
		s.replaceAll(" +", "")*/
	}

}
