import java.util.*;
class Brackets{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
String str=s.next();
char a[]=str.toCharArray();
int paren,bracks,sqracks;
paren=bracks=sqracks=0;
for(int i=0;i<str.length();++i){
for(int j=i+1;j<str.length();j++){
if(a[i]=='(' && a[j]==')'){
paren++;
a[j]=' ';
break;
}
if(a[i]=='{' && a[j]=='}'){
bracks++;
a[j]=' ';
break;
}
if(a[i]=='[' && a[j]==']'){
sqracks++;
a[j]=' ';
break;
}
}
}
System.out.println("()-"+paren);
System.out.println("{}-"+bracks);
System.out.println("[]-"+sqracks);
}}