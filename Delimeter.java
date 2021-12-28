import java.util.*;
public class Delimeter
{
	static int top=-1,i;
	static char stack[];
	static Scanner sc;
	public static void push(char ele)
	{
		stack[++top]=ele;
	}
	public static char pop()
	{
		return(stack[top--]);
	}
	public static void main(String[]args)
	{
		char ch;
		String str1;
		int count1=0,count2=0;
		sc=new Scanner (System.in);
		str1=sc.next();
		stack=new char[str1.length()];
		for(i=0;i<str1.length();i++)
		{
			push(str1.charAt(i));
		}
		for(i=0;i<str1.length();i++)
		{
			ch=pop();
			if(ch=='(')
			count1++;
			else if(ch==')')
			count2++;
		}
		if(count1==count2)
			System.out.println("symbols balanced");
		else 
			System.out.println("not balanced");
	}
}
