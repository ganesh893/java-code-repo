package InterivewQuetions;

public class Casting1 extends Casting2{

	public static void main(String[] args) {
      Casting1 c1= new Casting1();
      Casting2 c=(Casting2)c1;
      System.out.println("correct");
      
      Object o= new String("Ganesh");
      String s= (String)o;
      System.out.println(s);
      
	}

}
