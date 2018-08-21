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
             char ch1[]=new char[s.length()];
             int k=0;
            char ch[]=s.toCharArray();
            for(int i=0;i<s.length();i++)
            {
            if(Character.isDigit(ch[i]))
            {
              ch1[k]=ch[i];
              k++;
            }
            }
            for(int i=0;i<k;i++)
               System.out.print(ch1[i]);
	}
}
