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
		    for(int i=0;i<n;i++)
		    {
		    	if(i<n-1){
		     System.out.print(a[i]+" ");}
		     if(i==n-1)
		     System.out.print(a[i]);
		    }
	}
}
