import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Input some number: ");
        i = input.nextInt();

        while (i > 0) {
            System.out.println("* ".repeat(i));
            i--;
        }
    }
}
