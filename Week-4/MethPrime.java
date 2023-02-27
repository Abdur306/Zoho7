import java.util.*;
public class MethPrime{
public static void main(String [] args){
Scanner in=new Scanner(System.in);
System.out.println("start value");
int s=in.nextInt();
System.out.println("end value");
int e=in.nextInt();
int i,j;
int flag=0;
for( i=s;i<=e;++i){
	if(i==1||i==0)
	continue;
     flag=1;
for( j=2;j<=i/2;++j){
	if(i%j==0){
		flag=0;
		break;
}	
}


if(flag==1)
	
		
		System.out.println(i);
		
	}
			
		
//else
	//System.out.println("not a prime");

}
}




