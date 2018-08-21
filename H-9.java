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
                        int n=sc.nextInt();
                        int m=sc.nextInt();
                        int res=m*n;
                        for(int i=1;i<res;i++)
                        {
                        if(res==(i*i))
                        {
		  	System.out.print("yes");
		  	break;
                        }
		  	if(i==res-1)
		  	System.out.print("no");
                        }
		  
	}
}
