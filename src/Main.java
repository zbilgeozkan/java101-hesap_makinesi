import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        num1 = input.nextDouble();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        num2 = input.nextDouble();

        System.out.println("İşlemler:\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Lütfen hangi işlemi gerçekleştirmek istediğinizi seçiniz: ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Sonuç = " + (num1 / num2));
                break;
            default:
                System.out.println("Yanlış işlem seçtiniz!");

        }
    }
}