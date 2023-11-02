package Bank;
import java.util.*;
public class Member {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ID_PASS ip = new ID_PASS();
		ip.getdata();     
		float bal = 0f;
		float t=0f;
		float w=0f;
		String ch ="";
		System.out.println("Enter the Holder Name :");
		String name = sc.nextLine();
		System.out.println("WEllCOME TO HDFC BANK " + name);
		System.out.println(name + " Please Enter your Account Numbet...");
		int AccNum = sc.nextInt();
		System.out.println("===============================");
		System.out.println("Holder Name : "+name+"\nAccount Number : "+AccNum);
		
		do {
		System.out.println("---------------------------------");
		System.out.println("Enter the number :\n");
		
		System.out.println("1. Account Detail...");
		System.out.println("2. Deposit Amount...");
		System.out.println("3. Widrow Amount...");
		int num = sc.nextInt();
		System.out.println("-----------------------------------");
		switch (num) {
		case 1 : {
			System.out.println("Holder Name : "+name);
			System.out.println("Account Number : "+AccNum);
			System.out.println("IFSC Code : HDFC123SC59");
			break;
		}
		case 2 : {
			System.out.println("Enter The Deposit Amount...");
			float d = sc.nextFloat();
			bal = d + bal;
			System.out.println("Total Amount : "+bal);
			break;
		}
		case 3 : {
			System.out.println("Enter The Widrow Amount...");
			w = sc.nextFloat();

			if (bal>=w) {
				float wa = bal - w;
				System.out.println("Total Amount : "+wa);
				break;
			}
			
			else {
				System.out.println("insufficient Balance...");
				System.out.println("Total Balance = "+bal);
			}
		}
		

		}
		System.out.println("-------------------------------------");
		System.out.println("I Can Help You sir/mam : (Yes/No)");
		
		ch=sc.next();
		
		}
		while(ch.equalsIgnoreCase("Yes"));
		System.out.println("Thank You Sir/Mam, Have Good Day :");
		
	}

}
