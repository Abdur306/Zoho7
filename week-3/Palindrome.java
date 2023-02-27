                                        /*state is a palindrome with or without special characters*/

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String temp="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=32 && str.charAt(i)<=64 ) 
				continue;
				temp=temp+str.charAt(i);
			}
				
String temp2="";
for(int i=temp.length()-1;i>=0;--i) 
	temp2=temp2+temp.charAt(i);
	int length=temp2.length()-1;
	int increase=0;
	for(int i=0;i<temp.length()-1;i++) {
		if(temp.charAt(i)==temp2.charAt(i))
			increase++;
}
	
	if(increase==length)
		System.out.println("it is a palindrome");
	else 
		System.out.println("it is not a palindrome");
}

		
	
}

	