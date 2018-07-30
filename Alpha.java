/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
      	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        	System.out.println("Vowel");
        else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
        	     System.out.println("Consonant");
        	 else
        	       System.out.println("invalid");
	}
}
