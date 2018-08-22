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
		int l=sc.nextInt();
		int w=sc.nextInt();
	           int h=sc.nextInt();
	           int area=2*(l*h+w*h+w*l);
	           int volume=l*w*h;
	           System.out.println(area+" "+volume);
	}
}
