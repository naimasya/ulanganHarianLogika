package logically;
import java.util.Scanner;
public class nilaiterbesar {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Masukkan bilangan pertama:");
       int bil1 = scanner.nextInt();
       System.out.print("Masukkan bilangan kedua:");
       int bil2 = scanner.nextInt();
       int bilterbesar = 0;
       
       bilterbesar = (bil2>bil1)?bil2:bil1;
        System.out.println("Nilai terbesar dari kedua bilangan adalah : " + bilterbesar);
    }
    
}
