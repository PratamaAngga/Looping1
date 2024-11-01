import java.util.Scanner;
public class TheTriangle20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, numInput;
        String s = "";
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (i=0; i < numInput; i++) {
            s += "* ";
            System.out.println(s);
        }
    }
}
