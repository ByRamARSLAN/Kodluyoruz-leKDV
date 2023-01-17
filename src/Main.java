import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double fiyat, kdvOrani1, kdvOrani2, kdvTutari1,kdvTutari2,sonuc1,sonuc2;
        kdvOrani1 = 0.18;
        kdvOrani2 = 0.08;

        System.out.print("Ödenecek tutarı giriniz : ");
        fiyat = inp.nextDouble();

        kdvTutari1 = fiyat * kdvOrani1;
        kdvTutari2 = fiyat * kdvOrani2;
        sonuc1 = fiyat + kdvTutari1;
        sonuc2 = fiyat + kdvTutari2;

        System.out.print(fiyat <= 1000? "KDV Oranı : " + kdvOrani1 +"\nKDV\'li fiyat : " + sonuc1 :
                "KDV oranı : " + kdvOrani2 +"\nKDV\'li fiyat : " + sonuc2);


    }
}