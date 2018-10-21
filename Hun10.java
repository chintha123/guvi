import java.util.*;
class ArraySubset
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
		
     int m=sc.nextInt();
	
     int n=sc.nextInt();
	
     int a[]=new int[m];
	
	int b[]=new int[n];
	
	for(int i=0;i<m;i++)
	
	a[i]=sc.nextInt();
	
	for(int j=0;j<n;j++)
	
	b[j]=sc.nextInt();
    int count=0;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
       {
          if(a[i]==b[j]){
           count++;
           break;
          }
       }
    }
if(n==count+1)
System.out.print("YES");
else
System.out.print("NO");
}
}
