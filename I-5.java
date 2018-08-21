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
             char ch[]=s.toCharArray();
             for(int i=0;i<s.length();i=i+2){
             	if(i==s.length()||i==s.length()-2)
             	System.out.print(ch[i]+" ");
             	else
	          System.out.print(ch[i]);
             }
             for(int i=1;i<s.length();i=i+2)
             System.out.print(ch[i]);
	}
}
