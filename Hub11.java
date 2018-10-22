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
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			 s=s1[i];
			char ch[]=s.toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
			if(i==s1.length-1)
			System.out.print(ch[j]);
			else
			{
			if(j==0)
			System.out.print(ch[j]+" ");
			else
			System.out.print(ch[j]);
			}
			}
		}
	}
}
