package logically;
import java.util.Scanner;
public class ganjilgenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang anda inginkan :");
        int bil = scanner.nextInt();

        if(bil%2==0){
        System.out.println("Bilangan " + bil + " adalah bilangan genap");

        }else{
        System.out.println("Bilangan " + bil + " adalah bilangan ganjil");
        }
    }
}
