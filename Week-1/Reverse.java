import java.util.*;
class Reverse{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
int rev=0;
while(a!=0){
rev+=a%10;
a=a/10;
}
System.out.println("reverse is"+rev);
}
}