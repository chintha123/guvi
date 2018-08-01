/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Polindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,rev=0,b;
		while(n>0)
		{
			b=n%10;
			rev=(rev*10)+b;
			n=n/10;
		}
		if(temp==rev)
		         System.out.println("yes");
		 else
		      System.out.println("no");
		       
	}
}
