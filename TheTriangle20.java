import java.util.Scanner;
public class TheTriangle20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, numInput;
        String s = "";
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        while (i < numInput) {
            s += "* ";
            System.out.println(s);
            i++;
        }
    }
}
