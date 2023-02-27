import java.util.*;
class RotateArray{
public static void main(String[] args){

int i,j,last;
int n;


System.out.println("enter length");
Scanner scan=new Scanner(System.in);
 n=scan.nextInt();
int arr[]=new int[n];
System.out.println("enter the elements");

for(i=0;i<n;i++){
arr[i]=scan.nextInt();
}

System.out.println("enter pos");
int r=scan.nextInt();

for(i=0;i<r;i++){
last=arr[n-1];

for(j=n-1;j>0;j--){
arr[j]=arr[j-1];

}
arr[0]=last;
}
System.out.println("array after rotation");
String Sarr=Arrays.toString(arr);
System.out.println("array"+Sarr);

}
}