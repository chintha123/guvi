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
     int p=-1;
     Arrays.sort(a);
     for(int i=0;i<n;i++)
     {
     	int count=1;
     	for(int j=i+1;j<n;j++)
     	{
     	   if(a[i]==a[j])
     	   count++;
     	   else
     	   break;
     	}
     	p=p+count;
     	i=p;
     	if(count==1)
     	System.out.print(a[i]);
     	}
   }
}
