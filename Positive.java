/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
		     System.out.println("Positive");
		else if(a<0)
		     System.out.println("Negative");
		else 
		     System.out.println("Zero");
	}
}
