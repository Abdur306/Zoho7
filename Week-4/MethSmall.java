import java.util.*;
public class MethSmall{
public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
	
Compare obj=new Compare();
int result=obj.Cmp(n1,n2,n3);

}
}
class Compare{
public int  Cmp(int n1,int n2,int n3){
	//int low=n1;
	if(n1<n2){
		if(n1<n3)
			System.out.println("low num is "+n1);
		else
            System.out.println("low num is "+n3);			
	}
	else {
		
		if(n2<n3)
		System.out.println("low num is "+n2);
	    else
		System.out.println("low num is "+n3);

	}
	
	return 0;
}
}