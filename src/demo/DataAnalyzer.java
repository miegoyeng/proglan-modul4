package demo;
import java.util.Arrays;
import java.util.Scanner;
public class DataAnalyzer {
    static Scanner input = new Scanner(System.in);
    private static final int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};
    public static int[] getData() {
        return data;
    }
    public void cariNilai(){
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int cariNilai = input.nextInt();
        int indeksNiliai = Arrays.binarySearch(getData(), cariNilai);

        if(indeksNiliai >= 0){
            System.out.println("Nilai '" + cariNilai + "' berada pada indeks ke-" + indeksNiliai);
        }else{
            System.out.println("Nilai '" + cariNilai + "' tidak berada pada indeks data");
        }
    }
    public void hitungJumlahElemen(){
        System.out.println("Menhitung Jumlah Elemen");
        int totalPositif = 0, totalNegatif = 0, totalNol = 0;
        for (int nilai : getData()){
            if(nilai > 0){
                totalPositif++;
            } else if (nilai<0) {
                totalNegatif++;
            }else{
                totalNol++;
            }
        }
        System.out.println("1. Jumlah nilai positif    : " + totalPositif);
        System.out.println("2. Jumlah nilai negatif    : " + totalNegatif);
        System.out.println("3. Jumlah nilai 0          : " + totalNol);
    }
    static String sortingArray(){
        Arrays.sort(data);
        return Arrays.toString(data);
    }
    public static void main(String[] args) {
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        System.out.println("==> Data Analyzer <==");
        System.out.println("Data awal : \n" + Arrays.toString(getData()));
        System.out.println("Data setelah dirutkan : \n" + sortingArray());
       dataAnalyzer.cariNilai();
       dataAnalyzer.hitungJumlahElemen();
    }
}
