import java.io.*;
import java.util.*;
public class Number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int []a=new int[4];
for(int i=0;i<4;i++)
{
 a[i]=s.nextInt();
if(a[i]>0)
 System.out.println("positive");
else if(a[i]<0)
System.out.println("negative");
else
System.out.println("zero");
}
}
}
