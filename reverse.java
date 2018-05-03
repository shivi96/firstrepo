import java.util.Scanner;
class reverse
{
  public static void main(String args[])
    {
          int a , rev=0;
System.out.println("enter the no.");
Scanner in =new Scanner(System.in);
a=in.nextInt();

while(a!=0)
{
rev = rev*10;
rev =rev+ a%10;
a=a/10;
} 
System.out.println(rev);
      }
}             
               