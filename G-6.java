/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int count=0;
	   for(int i=1;i<n;i++)
	   {
	   	for(int j=1;j<n;j++)
	   	{
	   		if(i%j==0)
	   		count++;
	   	}
	   }
	   if(count==1)
	       System.out.println("yes");
	       else
	        System.out.println("no");
	}
}
