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
		String s=sc.next();
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			s2=s2+ch;
		}
		if(s2.equals(s))
		{
			char ch1[]=s.toCharArray();
			for(int i=0;i<ch1.length-1;i++)
			System.out.print(ch1[i]);
		}
		else
		System.out.print(s);
	}
}
