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
		int m=sc.nextInt();
	int[][] a=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
		a[i][j]=sc.nextInt();	
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
	      if(a[i][j]==0)
	      {
	      	for(int k=0;k<n;k++)
	      	{
	      		a[i][k]=0;
	      		a[k][i]=0;
	      	}
	      }
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
		if(j==m-1)
		System.out.print(a[i][j]);
		else
		System.out.print(a[i][j]+" ");
		}
		if(i!=n-1)
		System.out.println();
	}
	}
}
