package PracticePrograms;

public class StringChck {

	public static void main(String[] args) {
		
		String s="Ganesh";
		String s2= new String("Ganesh");
		s="Patkal";
		s2=new String("Patkal");
		System.out.println(s.equals(s2));//T
		System.out.println(s==s2);//F
		
		StringBuilder sb= new StringBuilder("Ganesh");
		System.out.println(s.equals(sb));//F -- StringBuffere/Builder does not override equals method of Object class
	//	System.out.println(s==sb);
		
		StringBuffer sbf= new StringBuffer("Ganesh");
		System.out.println(s.equals(sbf));//F
		System.out.println(sb.equals(sbf));//F
		
		
		int[] i= new int [10+5];
		int[] j={10,15,20,9};
		i[12]=50;
		System.out.println(i[12]);
		
		
	}

}
