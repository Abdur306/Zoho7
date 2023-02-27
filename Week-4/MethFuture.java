import java.util.*;
public class MethFuture{
public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
System.out.println("enter the amt");
double amt=s.nextDouble();
System.out.println("enter the rate of interest");
double r=s.nextDouble();
System.out.println("enter the yrs");
int yrs=s.nextInt();

future(amt,r,yrs);
}
public static  void future(double amt,double r,int yrs){
	
for(int  i=1;i<=yrs;++i){
double  result=amt*Math.pow(1+r/100,(i));
System.out.printf("%d =%.1f\n",i ,result);
}
}
}