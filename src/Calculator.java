import java.util.Scanner;

public class Calculator {
    public static void hesapla() {
        double sonuc, sayi1, sayi2, select;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = sc.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = sc.nextDouble();

        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("İşlemi seçiniz: ");

        select = sc.nextInt();

        if (select == 1) {
            sonuc = sayi1 + sayi2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 2) {
            sonuc = sayi1 - sayi2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 3) {
            sonuc = sayi1 * sayi2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 4) {
            sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        }
        else {
            System.out.println("Geçersiz işlem girdiniz");
        }

    }
}
