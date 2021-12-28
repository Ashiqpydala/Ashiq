import java.util.*;
public class Linked
{
static Node header,t,p;
static Scanner sc;
static class Node
{
int data;
Node next;
Node(int data){
this.data=data;
}
}
public static Linked insert(Linked list,int ele)
{
int ch,j,r;
Node temp=new Node(ele);
if(header==null)
{
	temp.next=null;
	header=temp;
}
else
{
	p=header;
	System.out.println("enter choice 1.Starting 2.Middle 3.End");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
		temp.next=header;
		header=temp;
		break;
		case 2:
		System.out.println("enter position");
		r=sc.nextInt();
		for(j=1;j<r;j++)
		{
			t=p;
			p=p.next;
		}
		t.next=temp;
		temp.next=p;
		break;
		case 3:
		while(p.next!=null)
		{
			p=p.next;
			p.next=temp;
			temp.next=null;
			break;
		}
	}
}

	return list;
}
public static Linked delete(Linked list)
{
	int ch,j,r;
	if(header==null)
	{
		System.out.println("The list is empty");
	}
	else
	{
		p=header;
		System.out.println("enter choice 1.Starting 2.Middle 3.End");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		System.out.println("deleted is"+p.data);
		header=header.next;
		break;
		case 2:
		System.out.println("enter position");
		r=sc.nextInt();
		for(j=1;j<r;j++)
		{
			t=p;
			p=p.next;
		}
		System.out.println("deleted is"+p.data);
		t.next=p.next;
		break;
		case 3:
		while(p.next!=null)
		{
			t=p;
			p=p.next;
			System.out.println("deleted is"+p.data);
			t.next=null;
		}
		break;
	}
}return list;

}
		 public static void display(Linked list)
		{
			if(header==null)
			
				System.out.println("the list is empty");
			
			else
			{
				p=header;
				System.out.println("the elements are");
				while(p!=null)
				{
					System.out.println(p.data+"-->");
					p=p.next;
				}
			}
		}
		public static void main(String[]args)
		{
			Linked list=new Linked();
		    sc=new Scanner(System.in);
			int ch,ele;
			do{
				System.out.println("Menu 1.Insert 2.Delete 3.Display 4.exit");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
				System.out.println("enter element");
				ele=sc.nextInt();
				list=insert(list,ele);
				break;
				case 2:
				list=delete(list);
				break;
				case 3:
				display(list);
				break;
				}
			}while(ch<=3);
		}
	
				
}
	
			

