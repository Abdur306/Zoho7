import java.util.*;
public class MethMiddle{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.next();

Midpt(str);
}
public static void Midpt(String str){

if(str.length()%2==0){
     int i=str.length()/2-1;
 int j=str.length()/2;
System.out.println(" "+str.charAt(i)+str.charAt(j));
}
else
{
	int i=str.length()
	/2;
System.out.println(" "+str.charAt(i));
}
}
}