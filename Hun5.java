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
      int x=0;
    while(n>0)
    {
    	int rem=n%10;
    	a[x]=rem;
    	n=n/10;
    	x++;
    }
    for(int i=0;i<x;i++)
    {
    	for(int j=i+1;j<x;j++)
    	{
    		if(a[i]>a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=a[i];
    		}
    	}
    }
     int p=-1;
     int res=0;
      for(int i=0;i<x;i++)
      {
         int count=1;
         for(int j=i+1;j<x;j++)
         {
              if(a[i]==a[j])
               count++;
               else
                 break;
           }
       if(count>1)
       res++;
      if(count==1)
      res++;
    p=p+count;
     i=p;
   }
   System.out.print(res);
	}
}
