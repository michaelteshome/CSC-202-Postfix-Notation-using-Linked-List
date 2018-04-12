import java.util.*;
public class Demo {

	static LinkedList<String> list = new LinkedList<String>();
	static Scanner kybd = new Scanner(System.in);
	public static void main(String[] args) {
		read();
		
	}
	
	public static void read() {
		String choice;
		String operator;
		String response;
		System.out.println("Enter a number 1 - 100");
		choice = kybd.nextLine();
		list.push(choice);
		
		System.out.println("Do you want to add more numbers: (Yes or No)");
		response = kybd.nextLine();
		
		
		
		while(response.equalsIgnoreCase("yes")) {
			read();
			response = kybd.nextLine();
			
		}
		
		if(response.equalsIgnoreCase("no")) {
			System.out.println("We will now move on to selecting your supporting arithemetic operators");
			//System.exit(0);
			selectArithmetic();
		}
		
		
		
		
		
		
	}
	
	public static void selectArithmetic() {
		String boston;
		String operator;
		System.out.println("Enter the operators you want to use: can only be (+, -, /, *) ");
		operator = kybd.nextLine();
		list.push(operator);
		
		
		System.out.println("Do you want to add more operators for future use: (Yes or No)");
		boston = kybd.nextLine();
		
		
		
		
		while(boston.equalsIgnoreCase("yes")) {
			selectArithmetic();
			boston = kybd.nextLine();
		}
		
		if(boston.equalsIgnoreCase("no")) {
			System.out.println("Alright!, we are all set. On behalf of me and Oracle, thank you for using JAVA");
			list.printList();
		}
		
	}

	
	
	
	
	
	

}
