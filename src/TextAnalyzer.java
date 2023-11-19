import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        String kalimat = null;
        boolean menu = true;
        while (menu){
            System.out.println("==> Teks Analyzer <==");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata Dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kalimat: ");
                    kalimat = string.nextLine();
                    break;
                case 2:
                    assert kalimat != null;
                    int kata = kalimat.length();
                    System.out.println("Kata \"" + kalimat + "\" memiliki jumlah karakter sebanyak " + kata);
                    break;
                case 3:
                    assert kalimat != null;
                    String[] kata2 = kalimat.split("\\s+");
                    int jumlahKata = kata2.length;
                    System.out.println("Jumlah kalimat yang diinput adalah " + jumlahKata);
                    break;
                case 4:
                    assert kalimat != null;
                    String[] kataDalamTeks = kalimat.split("\\s+");
                    System.out.print("kalimat yang ingin dicari : ");
                    String kataDicari= string.nextLine();
                    int jumlahMuncul=0;
                    for (String kata3 : kataDalamTeks) {
                        if (kata3.equalsIgnoreCase(kataDicari)) {
                            jumlahMuncul++;

                        }
                    }
                    System.out.println("Kata '" + kataDicari + "' muncul sebanyak " + jumlahMuncul + " kali dalam teks.");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis.");
                    menu = false;
                    break;
                default:
                    System.out.println("Input salah, silahkan coba lagi !");
                    break;
            }
        }
    }}