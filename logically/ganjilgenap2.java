package logically;
import java.util.Scanner;
public class ganjilgenap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa angka yang ingin diinputkan :");
        int N = scanner.nextInt();
        int bil;
        
        for(int i=0; i<N; i++){
            System.out.print("Masukkan bilangan : " );
            bil = scanner.nextInt();
            if (bil%2==0){
                System.out.println("Bilangan " + bil + " Genap");
            }else{
                System.out.println("Bilangan " + bil + " Ganjil");
            }
        }
    }
}
