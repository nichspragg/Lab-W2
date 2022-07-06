import java.util.Scanner;

public class week2lab {

	public static void main(String[] args) {
		//create a variable named age and assign it a value of 14
		int age = 14;
		//print the boolean expression age >= 16 to the console and note the results.
		//change the value of age to 18 and run again.
		System.out.println(age >= 16);
		age = 16;
		System.out.println(age >= 16);
		//using a conditional, print "You can drive" if age is greater than or equal to 16
		//and "You cannot drive" otherwise
		//change the value of age and rerun to see the result
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive.");
		} else { 
			System.out.println("You cannot drive.");
		}
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
				
		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		double costOfMilk = 1.50;
		int thirstLevel = 5;
		if (costOfMilk < 2.5 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else { 
			System.out.println("No Thanks");
		}
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohoooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		int numberOfCookies = 15;
		int numberOfChildren = 4;
		int myCookies = numberOfCookies % numberOfChildren;
		if (myCookies < 1 ) {
			System.out.println("Sad Face");
		} else if (myCookies < 2) {
			System.out.println("Yes!");
		} else if (myCookies < 5) {
			System.out.println("Whoohoooo!");
		} else {
			System.out.println("Jackpot!");
		}
		//create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//create a variable called loyaltyMemberDiscount and assign the value 0.0
		//using a switch, set the value of loyaltyMemberDiscount based on the following loylatyMemberStatus scale
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
			default:
				loyaltyMemberDiscount = 0;
		}
		//create a variable called billTotal and assign a value
		//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		double billTotal = 560.00;
		double adjustedTotal = (billTotal * (1 - loyaltyMemberDiscount)); 
		if (adjustedTotal > 500 && loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		} else if (adjustedTotal > 500 && loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		}
		System.out.println("Thank you for being a " + loyaltyMemberStatus + " member! Your total today is $" + adjustedTotal);
		//create two variables, username and password
		//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//otherwise, print "access denied"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Username:");
		String username = sc.nextLine();
		System.out.print("Password:");
		String password = sc.nextLine();
		
		if (username.equals("Tommy123") && password.equals("12345")) {
				System.out.println("login successful");
			} else {
				System.out.println("access denied");
				System.exit(0);
			}
		//write a for loop that prints each number from 0 to 9
		for (int a = 0; a < 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		//write a for loop that prints each number from 10 to 0 backwards
		for (int b = 10; b >= 0; b--) {
			System.out.print(b + " ");
		}
		System.out.println("\n");
		//write a for loop that prints every other number from 0 to 100
		for (int c = 0; c <= 100; c++) {
			if (c % 2 == 0) {
			System.out.print(c + " ");
			}
		}
		System.out.println("\n");
		//write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for (int d = 0; d <= 100; d++) {
			if (d % 2 == 0) {
				System.out.print(d + " EVEN, ");
			} else if (d % 2 == 1) {
				System.out.print(d + " ODD, ");
			}
		}
		System.out.println("\n");
		//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//divide each number by 3 and print the remainder to the console
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i--;
		}
		
		
	}

}
