package sathya;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			System.out.println("1. Add 2 nums");
			System.out.println("2. Symbol or Not");
			System.out.println("3. Big of 3 Nums");
			System.out.println("4. Display Table");
			System.out.println("5. Perfect Number");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter 2 nums :");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("sum = "+(a+b));
			}
			else if(choice==2)
			{
				System.out.println("Enter Character :");
				char ch=sc.next().charAt(0);
				if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))
				{
					System.out.println(ch+" is a symbol");
				}
				else
					System.out.println(ch+" Not a symbol");
			}
			else if(choice==3)
			{
				System.out.println("Enter 3 nums :");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				
				if(a>b && a>c)
					System.out.println(a+" is big");
				else if(b>c)
					System.out.println(b+" is big");
				else
					System.out.println(c+" is big");
			}
			else if(choice==4)
			{
				System.out.println("Enter num :");
				int a=sc.nextInt();
				for(int i=1;i<=10;i++)
				{
					System.out.println(a+" * "+i+" = "+(a*i));
				}
			}
			else if(choice==5)
			{
				System.out.println("Enter num :");
				int a=sc.nextInt();
				int sum=0;
				for(int i=1;i<a;i++)
				{
					if(a%i==0)
						sum+=i;
				}
				if(sum==a)
					System.out.println("Perfect Number");
				else
					System.out.println("Not a Perfect Number");
			}
			else if(choice==6)
			{
				System.out.println("your session is Exited");
				break;
			}
			else
				System.out.println("invalid choice");
		}

	}

}
