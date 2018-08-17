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
	   String s=sc.next();
	   int count=0;
	   for(int i=0;i<s.length();i++)
	   {
	   	char ch=s.charAt(i);
	   	if(ch=='0'||ch=='1')
	   	count++;
	   }
	   if(count==s.length())
	     System.out.print("yes");
	     else
	       System.out.println("no");
	  
	}
}
