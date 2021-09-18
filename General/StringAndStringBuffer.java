package General;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		
		String s1="ganesh";
		s1.concat("patkal");
		System.out.println(s1);
		//s1=s1.concat("patkal");
		//System.out.println(s1);
		
		StringBuffer sb= new StringBuffer("Ganesh");
		sb.append(" Patkal");
		System.out.println(sb);

	}

}
