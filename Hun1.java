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
      Arrays.sort(a);
     int p=-1;
     int uni=0;
      for(int i=0;i<n;i++)
      {
         int count=1;
         for(int j=i+1;j<n;j++)
         {
              if(a[i]==a[j]){
               count++;
                uni++;
               }
               else
                 break;
           }
       if(count>1)
        {
        	b[x]=a[i];
        	x++;
        }
    p=p+count;
     i=p;
   }
   for(int i=0;i<x;i++)
   {
   	if(i==x-1)
             System.out.print(b[i]);
             else
               System.out.print(b[i]+" ");
   }
if(uni==0)
System.out.print("unique");
	}
}
