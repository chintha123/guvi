/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     int b[]=new int[n];
     int x=0;
  for(int i=0;i<n;i++)
  {
  	if(i==a[i])
  	{
  		b[x]=a[i];
  		x++;
  	}
  }
  for(int i=0;i<x;i++)
  {
  	int min=b[i];
  	for(int j=i+1;j<x;j++)
  	{
  		if(min>b[j])
  		  min=b[j];
  	}
  	if(i==x-1)
  	System.out.print(min);
  	else
  	 System.out.print(min+" ");
  }
   }
}
