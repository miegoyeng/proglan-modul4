package demo;
import java.util.Random;
import java.util.Scanner;
public class RandomDataGenerator {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
     private int lowLimit, Uplimit;
     private int longStrLimit;
    public int getLowLimit() {
        return lowLimit;
    }
    public void setLowLimit(int lowLimit) {
        this.lowLimit = lowLimit;
    }
    public int getUplimit() { return Uplimit; }
    public void setUplimit(int uplimit) {
        Uplimit = uplimit;
    }
    public int getLongStrLimit() { return longStrLimit; }
    public void setLongStrLimit(int longStrLimit) {
        this.longStrLimit = longStrLimit;
    }

    public void randomIntegerGenerator(){
        System.out.print("Masukkan batas angka atas : ");
        setUplimit(input.nextInt());
        System.out.print("Masukkan batas angka bawah : ");
        setLowLimit(input.nextInt());
        System.out.println("Angka acak antara " + getUplimit() + " hingga " + getLowLimit() + " adalah '" + (random.nextInt(getUplimit() - getLowLimit() + 1) + getLowLimit()) + "'");
    }
    public void randomStringGenerator(){
        String characterAvail = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomStr = new StringBuilder();
        System.out.print("Masukkan panjang string acak : ");
        setLongStrLimit(input.nextInt());
        for (int i =0; i < getLongStrLimit(); i++){
            int randomIndex = random.nextInt(characterAvail.length());
            randomStr.append(characterAvail.charAt(randomIndex));
        }
        System.out.println("String acak dengan jumlah sebanyak " + getLongStrLimit() + " adalah '" + randomStr + "'");

    }
     public static void main(String[] args) {
        RandomDataGenerator dataGenerator = new RandomDataGenerator();
        boolean validInput = true;
        while (validInput){
            System.out.println("==> Random Data Generator <==");
            System.out.println("Menu :");
            System.out.println("1.Random Angka");
            System.out.println("2.Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3) : ");
            int menu = input.nextInt();

            switch(menu){
                case 1:
                    dataGenerator.randomIntegerGenerator();
                    break;
                case 2:
                    dataGenerator.randomStringGenerator();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    validInput = false;
                    break;
                default:
                    System.out.println("Input salah, silahkan coba lagi");
                    break;
            }
        }
    }
}
