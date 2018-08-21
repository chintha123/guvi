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
             int min=Math.min(m,n);
             int count=0;
             for(int i=1;i<=min;i++)
             {
                if(m%i==0&&n%i==0)
                count=i;
             }
               System.out.println(count);
	}
}
