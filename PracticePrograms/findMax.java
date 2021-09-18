package PracticePrograms;

import org.apache.http.util.Asserts;

public class findMax {

	public static void main(String[] args) {
	
		int[] ia={10,5,20,40,30};
		int temp;
		for(int i=0;i<ia.length;i++)
		{
			for(int j=i+1;j<ia.length;j++)
			{
				if(ia[i]>ia[j])
				{
					temp=ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
					
				}
			}
		}
		
	
      System.out.println(ia[ia.length-1]);
  	//Asserts.check(true, "abc");
      
      
      /********fibo*********/
      int n1=0,n2=1,n3;
      System.out.print(n1+" "+n2);
      int tot=20;
      
      for(int i=2;i<tot;i++)
      {
    	 n3=n1+n2;
    	 System.out.print(" "+n3); 
    	 n1=n2;
    	 n2=n3;
    	
      }
     
      
      
	}

}
