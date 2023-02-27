import java.util.*;
public class TSSFQ1{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[13];
int b[]=new int[6];
int c[]=new int[6];
//int c=s.nextInt();
for(int i=0;i<n;++i){
a[i]=s.nextInt();}

//a[0]=b[0];
for(int j=0;j<n/2;++j){
	
	a[j]=b[j];
	System.out.println(b[j]);
}

//a[6]=c[0];
for(int k=1;k<=n;k++){
	
	a[k+5]=c[k];
	System.out.println(c[k]);
}
}
}
