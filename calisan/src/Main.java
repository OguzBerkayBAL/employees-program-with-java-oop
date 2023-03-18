import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALISANLAR programina hosgeldiniz...");
        String islemler = "islemler\n" + "1.yazilimci islemleri\n" + "2. yonetici islemleri\n" + "cikis icin q ya basin";
        System.out.println("***************************************");
        System.out.println(islemler);
        System.out.println("***************************************");
        while (true) {
            System.out.println("islemi seciniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("programdan cikis yapiliyor...");
                break;
            } else if (islem.equals("1")) {
                yazilimci yazilimci1 = new yazilimci("Berkay", "BAL", 2121032034, "java,c,c#");
                String yazilimciIslem = "1.format at\n" + "2.bilgileriGoster\n" + "cikis icin q ya basin.";
                System.out.println(yazilimciIslem);
                while (true) {
                    System.out.println("islemi secin:");
                    String yazilimciIslem1 = scanner.nextLine();
                    if (yazilimciIslem1.equals("q")) {
                        System.out.println("cikis yapiliyor...");
                        break;
                    } else if (yazilimciIslem1.equals("1")) {
                        System.out.println("isletim sisteminizi giriniz:");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci1.formatAt(isletimSistemi);
                    } else if (yazilimciIslem1.equals("2")) {
                        yazilimci1.bilgileriGoster();
                    } else {
                        System.out.println("gecersiz giris yaptiniz...");
                    }
                }
            } else if (islem.equals("2")) {
                yonetici yonetici1 = new yonetici("Karim", "Bal", 151, 69);
                String yoneticiIslem = "1.zamYap\n" + "2.bilgileriGoster\n" + "cikis icin q ya basin.";
                System.out.println(yoneticiIslem);
                while (true) {
                    System.out.println("islemi secin:");
                    String yoneticiIslem1 = scanner.nextLine();
                    if (yoneticiIslem1.equals("q")) {
                        System.out.println("cikis yapiliyor...");
                        break;
                    } else if (yoneticiIslem1.equals("2")) {
                        yonetici1.bilgileriGoster();
                    } else if (yoneticiIslem1.equals("1")) {
                        System.out.println("ne kadar zam yapilsin?");
                        int zam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici1.zamYap(zam);
                    } else {
                        System.out.println("gecersiz giris yaptiniz...");
                    }

                }
            }
            else {
                System.out.println("gecersiz giris denemesi.");
            }
        }
    }
}

