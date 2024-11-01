import java.util.Scanner;
public class DoWhileLeaveEntitlement20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave;
        String confirmation;
        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();
        input.nextLine();
        
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.nextLine();
            
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();
                input.nextLine();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don't have enough leave entitlement! Please enter a valid number!");
                    continue;
                }
            } else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("No leave taken. Program exiting.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (leaveEntitlement > 0);

        if (leaveEntitlement == 0) {
            System.out.println("You have used up all your leave entitlement.");
        }
    }
}
