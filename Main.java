import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        String sys_parola= "1234";
        String sys_kullaniciadi="Eda";
        int giris_hakki=3;


        System.out.println("*************************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz..." );
        System.out.println("*************************************");

        while (true) {

            System.out.print("Kullanıcı Adınızı Giriniz..:");

            String kullaniciadi = scanner.nextLine();
            System.out.print("Lütfen Parolanızı Giriniz..:");
            String parola = scanner.nextLine();

            if ( sys_kullaniciadi.equals(kullaniciadi) && sys_parola.equals(parola)) {

                System.out.println("Hoşgeldiniz," + kullaniciadi);
                break;

            }

            else if ((!sys_kullaniciadi.equals(kullaniciadi)) && sys_parola.equals(parola)) {

                System.out.println("Kullanıcı Adınız Hatalı..");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkı:" + giris_hakki);


            } else if (sys_kullaniciadi.equals(kullaniciadi) && !sys_parola.equals(parola)) {

                System.out.println("Parolanız Hatalı..");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı:" + giris_hakki);

            } else {

                System.out.println("Kullanıcı ve Parolanız Hatalı..");
                giris_hakki-=1;
            }

            if (giris_hakki==0) {

                System.out.println("Giriş Hakkınız Bitmiştir..");
                break;
            }

        }


    }
}
