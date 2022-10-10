import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double acilis = 10;
        double taksimetre = 2.20;
        double mintutar = 20;
        double kilometre,tutar,tutar2;
        Scanner doublescanner = new Scanner(System.in);

        System.out.print("Kilometreyi giriniz: ");
        kilometre =doublescanner.nextDouble();


        tutar = acilis+(kilometre*taksimetre);
        boolean tksm = tutar>20.0;
        tutar = tksm ? (tutar) : (mintutar);
        System.out.println("Taksimetre Tutarınız: "+tutar);
    }
}

