/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c=1;
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   for(int i=0;i<b;i++)
	   {
	      c=c*a;
	   }
	   System.out.println(c);
	}
}
