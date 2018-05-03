import java.util.*;
class grade
{
public static void main(String args[])
{

int num = new Random().nextInt(100) + 1;
System.out.println("enter the no." + num);

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
