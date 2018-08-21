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
             char ch[]=s.toCharArray();
             for(int i=0;i<s.length();i++)
             {
             	for(int j=i+1;j<s.length();j++)
             	{
             		if(ch[i]==ch[j])
             		{
             			count++;
             		//	ch[j]='0';
             		}
             	}
             }
             if(count==0)
             System.out.println("yes");
             else
               System.out.println("no");
	}
}
