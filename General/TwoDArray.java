package General;

public class TwoDArray {

	
		  public static void main(String[] args) {
		    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    System.out.println(myNumbers.length);
		    for (int i = 0; i < myNumbers.length; i++) {
		    	System.out.println(myNumbers[i].length);
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
		    }
		  }
		

}
