import java.util.Scanner;
class grade
{
public static void main(String args[])
{
System.out.println("enter the no.");
int num = new Scanner(System.in).nextInt();

 if(num>90){
System.out.println("Grade A");
}
else if (num>80){
System.out.println("Grade B");
}
else if(num>65){
System.out.println("Grade C");
}
else{
System.out.println("Grade D");
}
}
}
