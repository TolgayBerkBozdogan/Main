import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int a = 10, b = 20, c = 40, d = 10;

        // == Esittir operatoru
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        // != Esit degil operatoru
        System.out.println(a != d);
        System.out.println(a != c);
        System.out.println(c != b);

        // > Buyuktur operatoru
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println(c > d);

        // >= Buyuk esit operatoru
        System.out.println(a >= b);
        System.out.println(a >= c);
        System.out.println(d >= b);

        // < Kucuktur operatoru
        System.out.println(a < b);
        System.out.println(a < d);
        System.out.println(c < b);

        // <= Kucuk esit operatoru
        System.out.println(a <= d);
        System.out.println(d <= b);
        System.out.println(c <= d);


        // Mantiksal operatorler
        int point;
        System.out.print("Notunuzu Girin:");
        point = input.nextInt();
        String result;
        result = point < 50 ? "Kaldınız" : "Geçtiniz";
        System.out.println(result);
        boolean x = true, y = false;
        System.out.println((x && y) || (x || y)); */

        // Kosullu ifadeler if-else-else if blokları
        /*int w = 20, z = 20;
        boolean compare = w == z;
        //String str = compare? "eşittir":"eşit değildir";
        //System.out.println(str);

        if(compare){
            w = 50;
            System.out.println("Eşittir. Yeni 'w'= " +w);
        }else{
            System.out.println("Eşit Değildir.");
        }*/

        /*int out = w+z;
        System.out.println("w + z = "+out);

        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);*/


        /*float saltRatio = 0.9f;
        if(saltRatio >= 0.8) {
            System.out.println("yüksek derecede tuzlu");
        }
        else if(0.5 < saltRatio && saltRatio < 0.8 ) {
            System.out.println("orta derecede tuzlu");
        }
        else {
            System.out.println("düşük derecede tuzlu");
        }*/

        /*int age=25;
        int weight=48;
        if(age>=18){

            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }

        }
        else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }*/

        /*int age = 25;
        int weight = 38;

        if ((age >= 18) && weight >= 48) {

            System.out.println("Kan verebilirsiniz");
        } else {
            System.out.println("Kan veremezsiniz");
        }*/

        //Switch Case
       /*int day = 5;

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatalı değer girdiniz!");
        }*/

        /*int points = 6;
        switch (points) {
            case 6:
                ;
            case 7:
                System.out.println("Java");
                break;
            case 8:
                ;
            case 9:
                System.out.println("101");
                break;
            case 10:
                System.out.println("Patika");
                break;
            default:
                System.out.println("Dev");
        }*/


        //Döngü Yapıları : While Döngüsü
        /* int i = 1;
        int k;
        System.out.println("Program başladı.");
        while (i<=5) {
            System.out.println(i);
            k = 1;
            while(k<=10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();

            i++;
        }
        System.out.println("Program bitti.");*/

        /*int left = 100, right = 200;
        while (++left <--right); {
            System.out.println("100 ile 200'ün ortası: " + left);
        }*/

       /* int isPassword;
        boolean isPasswordSuccess = false;

        while (!isPasswordSuccess) {
            System.out.println("Şifre Giriniz:");
            isPassword = input.nextInt();
            if(isPassword == 123456){
                System.out.println("Şifre Doğru");
                isPasswordSuccess = true;
            }else {
                System.out.println("Şifre Yanlış");
            }
        }*/

        // Do-While Döngüsü
        /*int year = 2023;
        do {
            System.out.println(year);
            year++;
        }
        while (year <2023);

        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }*/


        //For Döngüsü
        /*for (int i = 3; i <= 10; i += 2) {
            System.out.println(i);

        }
        System.out.println("-------------");

        int k = 3;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }*/
        /*int sayi;
        for(boolean run = true; run;){
            System.out.println("Sayı Giriniz: ");
            sayi = input.nextInt();
            if(sayi <0){
                run = false;
            }
        }*/
        /*int sayi;
        do {
            System.out.println("Sayı Giriniz");
            sayi = input.nextInt();

            }while (sayi>0);*/
        /*int i=0;
        for(i=1; i<=6;i++)
        {
            if(i%3==0)
                continue;
            System.out.print(i+",");
        }*/
        /*for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }
        /*for (int k = 0; k < 9; k++) {
            System.out.println("*");
            if (k == 3)
                break;
        }*/


        // continue örneği
       /* System.out.println("Continue örneği:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // i değeri 3 olduğunda continue kullanarak döngünün geri kalanını atlıyoruz
                continue;
            }
            System.out.println("i = " + i);
        }

        // break örneği
        System.out.println("\nBreak örneği:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                // j değeri 3 olduğunda break kullanarak döngüyü tamamen sonlandırıyoruz
                break;
            }
            System.out.println("j = " + j);
        }*/

        //ATN ÖRNEĞİ
       /* String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }*/


               /* int n1 = 18, n2 = 24,ebob=1, ekok;

                for(int i = 1; i <= n1 && i <= n2; ++i)
                {
                    if(n1 % i == 0 && n2 % i == 0)
                        ebob = i;
                }

                ekok = (n1 * n2) / ebob;
                System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
                System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);*/

        // N tane sayının min max değerlerini bulma
        /*int adet,sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("KAÇ ADET SAYI GİRCEKSİNİZ:");
        adet=input.nextInt();
        for(int a=1;a<=adet;a++){
            System.out.print(a+"'inci SAYI GİRİNİZ:");
            sayi=input.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);*/


        //  METOD(FONKSİYON) TANIMI
        /*int case1 = power(2, 8);
        System.out.println(case1);
    }

    static int power(int base, int exp) {
        int total = 1;
        for (int i = 1; i <= exp; i++) {
            total *= base;
        }
        return total;

    }*/


    }



}
