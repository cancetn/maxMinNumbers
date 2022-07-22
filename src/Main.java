import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
         ve bu sayıları ekrana yazan programı yazın.
         */

        int n, sayi, maxDeger=1, minDeger=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi adedini giriniz = ");

        n = inp.nextInt();

        if(n==1){
            System.out.println("Buyuk kucuk karsilastirmasi icin minimum 2 sayi girisi yapmaniz gerekmektedir.");
            return;
        }

        for(int i=1; i<=n; i++){
            System.out.println(i+" . sayiyi giriniz = ");
            sayi = inp.nextInt();

            if(sayi > maxDeger){
                maxDeger = sayi;
            }
            if(sayi < minDeger){
                minDeger = sayi;
            }

        }

        System.out.println("Girdiginiz en buyuk sayi = "+maxDeger);
        System.out.println("Girdiginiz en kucuk sayi = "+minDeger);








    }
}
