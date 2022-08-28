package ucusProjesi;

import java.util.Scanner;

public class OdemeMenusu {// ozgur,zeki

    public void odemeMenusu() {
        // burada fiyat hesapla menusunden hesaplanan fiyatla odeme işlemi yapılacak
        // odeme kk ile olacak kk bilgileri vs.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kart üzerinda yazılı olan isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen kart üzerinda yazılı olan soyisminizi giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("Lütfen 16 haneli kart numarasını giriniz...**** **** **** ****");
        String kartNo = scan.nextLine();
        while (kartNo.length() != 19) {
            System.out.println("Lütfen 16 haneli kart numarasını istenen şekilde 16 haneli olarak giriniz...\n**** **** **** *****");
            kartNo = scan.nextLine();
        }
        System.out.println("Lütfen kartınızın son kullanma tarihini giriniz... **/**");
        String sonKullanmaTarihi = scan.nextLine();
        while (sonKullanmaTarihi.length() != 5) {
            System.out.println("Lütfen son kullanma tarihini istenen şekilde giriniz...\n**/**");
            sonKullanmaTarihi = scan.nextLine();
        }
        System.out.println("Lütfen kartınızın arkasında yazan 3 haneli güvenlik kodunu giriniz...");
        int guvenlikKodu = scan.nextInt();
        while (guvenlikKodu < 0 || guvenlikKodu > 999) {
            System.out.println("Lütfen guvenlik kodunu üç haneli olarak giriniz");
            guvenlikKodu = scan.nextInt();
        }
        System.out.println("**** **** **** " + kartNo.substring(15) + " kart no lu");
        System.out.print("Sayın " + isim.charAt(0));
        int i = 1, j = 1;
        while (i < isim.length()) {
            System.out.print("*");
            i++;
        }
        System.out.print(" " + soyIsim.charAt(0));
        while (j < soyIsim.length()) {
            System.out.print("*");
            j++;
        }
        System.out.println(" Ödeme bilgileriniz alınmıştır...İyi yolculuklar dileriz.");
    }
}
