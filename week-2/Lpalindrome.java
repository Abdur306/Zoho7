import java.util.*;
public class Lpalindrome{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(longestPalSubStr(str));
}

static void printSubStr(String str,int low,int high){
for(int i=low;i<=high;++i)
System.out.print(str.charAt(i));
}
static int longestPalSubStr(String str){
int n=str.length();
int maxLength=1,start=0;
for(int i=0;i<str.length();i++){
for(int j=i;j<str.length();j++){        
int flag=1;
for(int k=0;k<(j-i+1)/2;k++)
if(str.charAt(i+k)!= str.charAt(j-k))
flag=0;
if(flag!=0 && (j-i+1)>maxLength){
start=i;
maxLength=j-i+1;
}
}
}
System.out.println("longer palindrome");
printSubStr(str,start,start+maxLength-1);
return maxLength;
}
}