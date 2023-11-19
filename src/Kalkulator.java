import java.util.Scanner;

public class Kalkulator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("==> Kalkulator <==");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma Natural");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kalimat: ");
                    double bilangan0 = input.nextDouble();
                    double akar = Math.sqrt(bilangan0);
                    System.out.println("Akar kuadrat dari " + bilangan0 + " adalah " + akar);
                    break;
                case 2:
                    System.out.println("Masukkan bilangan: ");
                    double bilangan1 = input.nextDouble();
                    System.out.println("Masukkan pangkat: ");
                    int pangkat = input.nextInt();
                    double hasil = Math.pow(bilangan1, pangkat);
                    System.out.println(bilangan1 + " pangkat " + pangkat + " adalah " + hasil);
                    break;
                case 3:
                    System.out.println("Masukkan bilangan: ");
                    double bilangan2 = input.nextDouble();
                    double logaritma = Math.log(bilangan2);
                    System.out.println("Logaritma natural dari " + bilangan2 + " adalah " + logaritma);
                    break;
                case 4:
                    System.out.println("Masukkan bilangan: ");
                    int bilangan3 = input.nextInt();
                    int faktorial = 1;
                    for (int i = 1; i <= bilangan3; i++) {
                        faktorial *= i;
                    }
                    System.out.println("Faktorial dari " + bilangan3 + " adalah " + faktorial);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                    menu = false;
                    break;
                default:
                    System.out.println("Input salah, silahkan coba lagi !");
                    break;
            }
        }
    }
}