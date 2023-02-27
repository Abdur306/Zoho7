import java.util.*;
class Str{
public static void main(String [] args){
System.out.println("enter the string");
Scanner s=new Scanner(System.in);
String st=s.next();
char a[]=st.toCharArray();
System.out.println("splited one");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}