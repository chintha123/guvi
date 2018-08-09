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
		    for(int i=0;i<n;i++)
		     {
		     	for(int j=i+1;j<n;j++)
		     	{
		     	if(a[i]>a[j])
		     	{
		     		int temp;
		     		temp=a[i];
		     		a[i]=a[j];
		     		a[j]=temp;
		     	}
		     }
		     }
		   int mid,med;
		   if(n%2==0)
		   {
		       mid=n/2;
		       med=(a[mid-1]+a[mid])/2;
		   }
		   else
		   {
		      mid=n/2;
		      med = a[mid];
		   }
		   System.out.println(med);
	}
}
