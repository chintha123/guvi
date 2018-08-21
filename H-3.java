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
		int k=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n+1;i<=m;i++)
		{
			if(i==k){
				System.out.println("yes");
				break;
			}
			else if(i==m)
			System.out.println("no");
		}
	}
}
