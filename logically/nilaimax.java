package logically;
import java.util.Scanner;
public class nilaimax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, maksimum, array[];

        Scanner input = new Scanner(System.in);
        System.out.print("Berapa angka yang ingin diinputkan : ");
        a = scan.nextInt();

        array = new int[a];

        System.out.println("Masukkan " + a + " angka");
        for (int i = 0; i < a; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        maksimum = array[0];

        for (int i = 0; i < a; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
            }
        }
        System.out.println("Nilai Maksimum adalah " + maksimum);
    }
}
