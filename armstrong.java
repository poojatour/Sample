import java.io.*;
import java.lang.*;
import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
int a,arm=0,n,temp;
Scanner s= new Scanner(System.in);
System.out.println("\n Enter a number :-");
n=s.nextInt();
temp=n;
while(n!=0)	
{
a=n%10;
arm= arm+(a*a*a);
n=n/10;
}
if(arm==temp)
{

System.out.println("\n The number is a armstrong number :-"+temp);
}
else
{
System.out.println("\n The number is a not armstrong number :-"+temp);
}

}
}