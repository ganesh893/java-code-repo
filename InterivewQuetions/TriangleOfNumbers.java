package InterivewQuetions;

public class TriangleOfNumbers {

	public static void main(String[] args) {


/*		int 
		//i, j, 
		row=6;   
		//outer loop for rows  
		for(int i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(int j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   */
		 for(int i=0;i<5;i++)
		   {
			   for(int j=0;j<=i;j++)
			   {
				   System.out.print(" "+i+" ");
			   }
			   System.out.println();
		   }
		 
		 for(int i=0;i<5;i++)
		 {
			 for (int j=2*(5-i); j>=0; j--)         
			 {  
			 //prints space between two stars      
			 System.out.print(" ");   
			 }   
			 for( int j=0;j<=i;j++)
			   {
				   System.out.print("* ");
			   }
			 System.out.println();
		 }

	}

}
