import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,türk,kim,müz;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        türk = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        müz = inp.nextInt();

        double avarage = (mat + fiz + türk + kim + müz) / 5 ;
        if(avarage <= 55 ){
            System.out.println("Kaldınız! Seneye Tekrar Görüşmek üzere:) ");
        }
        else{
            System.out.println("Tebrikler geçtiniz! ");
        }
        if(avarage >= 0 && avarage <=100) {
            System.out.println("Ortalamanız: " + avarage);
        }
        else{
            System.out.println("Ortalamanız hesaplanamıyor. Lütfen notlarınızı yeniden giriniz:");
            System.out.print("Matematik notunuzu giriniz: ");
            mat = inp.nextInt();
            System.out.print("Fizik notunuzu giriniz: ");
            fiz = inp.nextInt();
            System.out.print("Türkçe notunuzu giriniz: ");
            türk = inp.nextInt();
            System.out.print("Kimya notunuzu giriniz: ");
            kim = inp.nextInt();
            System.out.print("Müzik notunuzu giriniz: ");
            müz = inp.nextInt();
            avarage = (mat + fiz + türk + kim + müz) / 5 ;
            System.out.println("Ortalamanız: " + avarage);
        }
    }
}