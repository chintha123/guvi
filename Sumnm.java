/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sumnm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0,i;
		int a[] = new int[10];
		for(i=0;i<n;i++)
		   a[i]=sc.nextInt(); 
	    for(i=0;i<m;i++)
	       sum=sum+a[i];
	       System.out.println(sum);
		   
	}
}
