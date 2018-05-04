class pattern1{
public static void main(String[] args){
for(int j=1;j<7;j++){
 for(int i=0; i<=6;i++){
 if (i==0 || i==6-j){
System.out.print(j);
}
System.out.print(" ");
}
System.out.println();
}
}
}
//Output:
//1     1
//2    2
//3   3
//4  4
//5 5
//6

