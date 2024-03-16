 

import java.util.*;
public class Task1 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n1,n2,ch,result,i=1;
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Factorial");
			System.out.println("6.Exit");
			System.out.println("Enter your choice");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter 1st no=");
				n1=in.nextInt();
				System.out.println("Enter 2nd no=");
				n2=in.nextInt();
				result=n1+n2;
				System.out.println("Addition="+result);
				break;
			case 2:
				System.out.println("Enter 1st no=");
				n1=in.nextInt();
				System.out.println("Enter 2nd no=");
				n2=in.nextInt();
				result=n1-n2;
				System.out.println("Subtraction="+result);
				break;
			case 3:
				System.out.println("Enter 1st no1=");
				n1=in.nextInt();
				System.out.println("Enter 2nd no2=");
				n2=in.nextInt();
				result=n1*n2;
				System.out.println("Multiplication="+result);
				break;
			case 4:
				System.out.print("Enter 1st no=");
				n1=in.nextInt();
				System.out.print("Enter 2nd no=");
				n2=in.nextInt();
				result=n1/n2;
				System.out.println("Division="+result);
				break;
			case 5:
				System.out.println("Enter 1st no=");
				n1=in.nextInt();
				result=1;
				for(i=1;i<=n1;i++)
				result*=i;
				System.out.println("Factorial="+result);
				break;
			case 6:
				System.out.print("Treminate");
				break;
			 
		 	default:
		 		System.out.print("Wrong choice");
		 		break;
						
				
				
				
				
			}
			
			
		}
		while(ch!=6);
	}

}
