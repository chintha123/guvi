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
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()>s2.length())
		  System.out.println(s1);
		 else if(s1.length()<s2.length())
		   System.out.println(s2);
		 else
		 {
		 	char c11,c22;
                     for (int i = 0; i < s1.length(); i++) 
                     {
                               c11=s1.charAt(i);
                              c22=s2.charAt(i);
                              if(c11==c22)
                                 System.out.print(c11);
                              else if(c11>c22)
                              {
                                 System.out.print(s1);
                                 break;
                              }
                              else
                              {
                              	 System.out.print(s2);
                              	 break;
                              }
                  }
		 }
	}
}
