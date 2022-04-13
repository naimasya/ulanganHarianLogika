package logically;
import java.util.Scanner;
public class jumlahnilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int bil = scanner.nextInt();
        int jumlah = 0;
        
        for(int i=1; i<=bil; i++)
        jumlah += i;
        System.out.println("Jumlah dari nilai tersebut : " + jumlah);
    }
}
