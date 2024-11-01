import java.util.Scanner;
public class ForMultiples20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;
        double avr;
        System.out.print("Input the multiple: ");
        multiple = sc.nextInt();

        for(int i = 1; i<=50;i++) {
            if (i % multiple == 0) {
                sum= sum + i;
                counter++;
            }
        }

        avr = (double) sum / counter;

        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum off all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        System.out.println("The average of all the specified multiples is: " + avr);
    }
}