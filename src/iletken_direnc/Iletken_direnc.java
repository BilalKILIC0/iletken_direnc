// Klavyeden bir iletkenin direnc ve akımı girildiğinde uçlardaki gerlimi hesaplayan program.

/*
Adım 1: Başla.
Adım 2: Kullanıdan direnç ve akım değerlerini al.
Adım 3: Aldığın değerleri double veri tipi ile (direnc*akim) olarak işlem yap.
Adım 4: Bulduğun sonucu ekrana yazdır.
Adım 5: Dur.

*/

package iletken_direnc;
import java.util.Scanner;


public class Iletken_direnc {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen İletkenin Direncini Giriniz :");
        int direnc=input.nextInt();
        System.out.println("Lütfen Akımı Giriniz :");
        int akim= input.nextInt();
        
        double gerilim=direnc*akim;
        
        System.out.println("İletkenin Uçlarındaki gerilim :" +gerilim);
        
        
    }
    
}
