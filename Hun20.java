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
	int res=0;
		for(int i=n+1;i<m;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
			    if(i%j==0)
				count++;
			}
			if(count==2)
			res=i;
		}
		String s=Integer.toBinaryString(res);
		int x=0;
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch=='1')
		x++;
		}
		System.out.print(x);
	}
}
