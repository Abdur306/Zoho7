import java.util.*;
class RemoveDup{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(a[i]==a[j]){
			a[j]=0;
		}
	}
}
System.out.println(Arrays.toString(a));

}

}