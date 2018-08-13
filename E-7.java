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
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		 a[i]=sc.nextInt();
		 int large=a[0],small=a[0];
		 for(int i=1;i<n;i++)
		 {
		 	if(a[i]>large)
		 	  large=a[i];
		 	 if(a[i]<small)
		 	  small=a[i];
		 }
		 System.out.print(small+" "+large);
	}
}
