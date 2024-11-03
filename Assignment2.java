import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0, totalPendapatan = 0, i = 1, jumlahTiket, hargaBeli;

        while (true) {
            System.out.print("Input the number of tickets purchased by customer - " + i + " (type 0 to stop the program): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("The input is invalid, please input the valid number!");
                continue;
            } else if (jumlahTiket == 0) {
                break;
            }

            hargaBeli = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                hargaBeli *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaBeli *= 0.9;
            }

            totalTiket += jumlahTiket;
            totalPendapatan += hargaBeli;

            i++;
        }

        System.out.println("Total tickets sold today: " + totalTiket);
        System.out.println("Total revenue today: " + totalPendapatan);
    }
}
