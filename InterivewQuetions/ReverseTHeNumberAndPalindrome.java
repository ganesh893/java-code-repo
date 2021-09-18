package InterivewQuetions;

public class ReverseTHeNumberAndPalindrome {

	public static void main(String[] args) {

      int inum=12321;
      int iTemp=inum;
      int rev=0;
      
      while(inum!=0)
      {
    	  int rem=inum%10;
    	  rev=rev*10+rem;
    	  inum=inum/10;
    	  
      }
      if(iTemp==rev)
      {
    	  System.out.println("the number revers"+rev);
      }

	}

}
