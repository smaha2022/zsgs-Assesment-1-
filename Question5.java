package zoho.test;

import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Question5 {

	public static void main(String[] args) {
		{
	        String input ;
	        String reference ;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the  value: ");
	        
			System.out.println("Enter the Key :");
	        input=sc.nextLine();
	        reference=sc.nextLine();

            System.out.println("key" + " : " + "value");
	        HashMap<Character, Integer> charCount = new HashMap();
	        for (int i = 0; i < reference.length(); i++)  
	        {
	            charCount.put(reference.charAt(i),0);  // to set key
	        }

	        for (int i = 0; i < input.length(); i++)
	        {
	            char c = input.charAt(i);
	            if (charCount.containsKey(c))  // value contains key  
	            {
	            	int count = charCount.get(c); //char count equals 
	                charCount.put(c, count + 1); //char ,count addition
	                
	            }
	        }

	        for (char c : charCount.keySet()) // addition keyset record 
	        {
	            System.out.println(c + ": " + charCount.get(c)); //print statement
	        }
	    }
	}

}
