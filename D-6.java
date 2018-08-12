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
		int count=0;
		for(char c:s.toCharArray())
		{
			if(Character.isDigit(c));
			else if(Character.isLetter(c));
			else if(c==' ');
			else
			count++;
		}
		System.out.println(count);
	}
}
