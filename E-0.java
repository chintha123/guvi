import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pr,count=0;
        
       for(int i=0;i<n;i++)
       {
       	pr=(int)Math.pow(2,i);
       	if(pr==n)
                  count++;
       }
       if(count==0)
          System.out.println("no");
          else
             System.out.println("yes");
	}
}
