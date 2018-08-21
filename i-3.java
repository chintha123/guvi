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
		String s[]=new String[3];
		for(int i=0;i<3;i++)
		s[i]=sc.next();
	  Integer a = Integer.valueOf(s[0]);
	  Integer b = Integer.valueOf(s[2]);
	   String ch = s[1];
	   if(ch.equals("/"))
	   System.out.println(a/b);
	   else
	    System.out.println(a%b);
	}
}
