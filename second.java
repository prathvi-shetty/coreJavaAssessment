package java_assessment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class customer{
	 public String name;
	 private String password;
	 public ArrayList login() {
		 ArrayList<String> customer = new ArrayList<String>();
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter username");
		 name = s.nextLine();
		 Scanner z = new Scanner(System.in);
		 System.out.println("Enter password");
		 password = z.nextLine();
		 customer.add(name);
		 customer.add(password);
		 return customer;
		 
		 
	 }
	
	 
	
}
class product{
	public String name;
	
	public String enterProduct() {
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter product name");
		 name = s.nextLine();
		 
		
		 return name;
		 
		 
		 
	 }
}
public class second {
	public static void main(String args[]) throws IOException {
		Map<String, ArrayList<String>> database = new HashMap<String, ArrayList<String>>();
		Map<String, String> productList = new HashMap<String, String>();
		ArrayList<String> list;// The name acts as key and the value holds arraylist with username and password
		while(System.in.available() == 0) {
			System.out.println("1.Register, 2. Create product 3. Order 4. Checkout 5. Vie orders 5.exit");
			Scanner option = new Scanner(System.in);
			int opt = option.nextInt();
			switch(opt) {
			case 1 : customer c = new customer();
			       Scanner z = new Scanner(System.in);
			       System.out.println("Enter name");
			       String name = z.nextLine();
			       list = c.login();
			       database.put(name,list);
			       System.out.println(database.get(name));
			       break;
			       
			case 2 : product p  = new product();
			         Scanner y = new Scanner(System.in);
			         System.out.println("Enter id");
			         String id = y.nextLine();
			        String n = p.enterProduct();
			        productList.put(id, n);
			        break;
					 
			         
			       
			       
			       
			       
			         
			         
			}
		}
		
	}

}
