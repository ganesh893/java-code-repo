package PracticePrograms;

import java.util.Arrays;

public class RemoveDuplicateFromString {
	static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {     
        	System.out.println(str[i]);
            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
            	//System.out.println(str[i]+" "+str[j]);
                if (str[i] == str[j])   
                {   
                    break;   
                } 
              //  System.out.println("ABC");
            }   
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
            	//System.out.println(str[index]);
                str[index++] = str[i]; 
                System.out.println(str[index]);
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    // main() method starts  
    public static void main(String[] args)   
    {   
        String info = "javaTpoint is the best learning website";  
        //Converting string to character array  
        char str[] = info.toCharArray();  
        //Calculating length of the character array  
        int len = str.length;   
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);
    }
}
