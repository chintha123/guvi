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
                        int d,k=0;
                        int a[]=new int[30];
                        for(int i=n;i>0;)
                        {
                        	d=i%10;
                        if(d%2!=0){
		  a[k]=d;
		  k++;	
                        }
                        i=i/10;
                        }
                        for(int i=k-1;i>=0;i--){
                        	if(i==0)
                        	System.out.print(a[i]);
                        	else
                        	System.out.print(a[i]+" ");
                        }
	}
}
