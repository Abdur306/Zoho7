import java.util.*;
class Lexicographical{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the string ");
String str=s.nextLine();
char a[]=str.toCharArray();
for(int i=0;i<a.length;++i){
	boolean check=false;
for(int j=i+1;j<a.length;++j){
if(a[i]==a[j]){
check=true;
break; 
}
}
if(!check){
System.out.print(a[i]);
}
}
}
}