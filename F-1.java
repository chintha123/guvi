import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a[]=new int[20];
        int temp=n;
        while(n>0)
        {
        	n=n/10;
        	count++;
        }
        for(int i=0;i<count;i++)
        {
        a[i]=temp%10;
        temp=temp/10;
	}
	for(int i=count-1;i>=0;i--)
	{
		if(i==0)
			System.ouy.print(a[i]);
		else
	System.out.print(a[i]+" ");
	}
}
