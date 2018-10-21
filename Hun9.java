/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here	Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    int min=Math.abs(a[0]+a[1]);
	    int sum=0;
	    int min1=0;
	    int min2=1;
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=i+1;j<n;j++)
	    	{
	    		sum=Math.abs(a[i]+a[j]);
	    		if(min>sum)
	    		{
	    			min1=i;
	    			min2=j;
	    			min=sum;
	    		}
	    	
	    	}
	    }
	    System.out.print(a[min1]+" "+a[min2]);
	}
}
