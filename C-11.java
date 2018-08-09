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
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		int hr,mi;
		hr=Math.abs(n1-n2);
		mi=Math.abs(m1-m2);
		System.out.println(hr+" "+mi);
	}
}
