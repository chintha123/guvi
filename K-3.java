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
		String s=sc.nextLine();
		String s1[]=s.split("\\s");
		for(int i=0;i<s1.length;i++)
		{
			char c=s1[i].charAt(0);
			char t=Character.toUpperCase(c);
			s1[i]=s1[i].replace(c,t);
		}
		for(int i=0;i<s1.length;i++)
		{
		if(i==s1.length-1)
		System.out.print(s1[i]);
		else
		System.out.print(s1[i]+" ");
		}
	
	}
}
