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
             int m=sc.nextInt();
             int n=sc.nextInt();
            int max=Math.max(m,n);
             int lcm=0;
             while(true)
             {
             	if(max%m==0&&max%n==0)
             	{
             	lcm=max;
             	break;
             	}
             	++max;
             }
               System.out.println(lcm);
	}
}
