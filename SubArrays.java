package zoho.test;

import java.util.Arrays;

public class SubArrays {

	public static void main(String[] args)
	    {
		 int[] arr = {1, 2, 3, 1, 5,};
	      splitArray(arr);
	    }

	    public static void splitArray(int[] arr) 
	        {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++)
	        {
	            sum =sum+ arr[i];  //12
	        }

	        if (sum % 2 != 0) //12%2=0  
	        {
	            System.out.println("Cannot split array ");
	            return;
	        }
            int a =sum/2;      //6
            int arraySum = 0;  //constant // three
	        int subArrayStartIndex = 0; //count inialization;
	        int subArrayEndIndex = 0;
	        
	        for (int i = 0; i < arr.length; i++) 
	          {
	            arraySum =arraySum + arr[i];  //0+1=1;1+1=2;2+1=3  =>1+2+3=6
	            if (a == arraySum)//a (6)=arraysum(6)
	            {
	                subArrayEndIndex = i;//i=2
	                System.out.println(" Two arrays: " + Arrays.toString(Arrays.copyOfRange(arr, subArrayStartIndex, subArrayEndIndex + 1)));
	                subArrayStartIndex = i + 1; //i=3
	                arraySum = 0; //next two
	            }
	        }
	    } 



}



	


