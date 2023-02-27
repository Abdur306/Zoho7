import java.util.*;
public class MethSpace{
public static  void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the string ");
String str=s.nextLine();
space(str);

}
public static void space(String str){

int space=1;
for(int i=0;i<str.length();++i){
if(str.charAt(i)==32)
space++;
}
System.out.println(" "+space);
}
}
