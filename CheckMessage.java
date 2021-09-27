import java.util.Scanner;

public class CheckMessage {

	public void check(String message) {
		int action;
		do {
			System.out.println("Select an action:");
			System.out.println("1. Check");
			System.out.println("2. Delete");
			System.out.println("3. Send");
			Scanner scanner = new Scanner(System.in);
			action = scanner.nextInt();
			switch (action) {
				case 1 :
					System.out.println("Your Message is: " + message);
					break;
				case 2:
					System.out.println("Message Deleted");
					break;
				case 3:
					System.out.println("Message Sent");
					break;
			}
		} while (action == 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Message ending with end:");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		String end = "end";
		if (message.contains(end)) {
			message = message.replace(" " + end,"");
			CheckMessage checkMessage = new CheckMessage();
			checkMessage.check(message);
		} else {
			System.out.println("Message is Invalid");
		}

	}

}
