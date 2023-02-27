                             /*dual number is same add thst number.non 0's are left rest are rigth*/

import java.util.*;
class DualAdd{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the no.of.elements");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elemnts");
for(int i=0;i<n;++i)
a[i]=s.nextInt();
for(int i=0;i<n-1;++i){
if(a[i]==a[i+1]){
a[i]=a[i]+a[i+1];
a[i+1]=0;
}
}
int output[]=new int[n];
int k=0;
for(int i=0;i<=n-1;++i){
if(a[i]>0)
output[k++]=a[i];
}
for(int i=0;i<=n-1;i++)
System.out.println(output[i]+"");


}
}