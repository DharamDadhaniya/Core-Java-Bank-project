package Bank;

import java.util.*;

import javax.management.loading.PrivateClassLoader;

public class ID_PASS {
	
	private int ID;
	private String Pass;
	
	public void getdata() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the ID Number : ");
		ID = sc.nextInt();
		
		System.out.println("Enter the ID Password : ");
		Pass = sc.next();
		
			System.out.println("=============================");
			System.out.println("Wellcome To HDFC Bank :");
		
	
		
	}

}
