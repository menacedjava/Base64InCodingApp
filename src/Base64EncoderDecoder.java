import java.util.Base64;
import java.util.Scanner;

public class Base64EncoderDecoder {

    public static String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }


    public static String decode(String base64Text) {
        return new String(Base64.getDecoder().decode(base64Text));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Base64 kodlash va dekodlash dasturi");
        System.out.println("1. Matnni Base64 formatida kodlash");
        System.out.println("2. Base64 formatini oddiy matnga dekodlash");
        System.out.print("Tanlovni kiriting (1 yoki 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Kodlash uchun matnni kiriting: ");
            String text = scanner.nextLine();
            String encodedText = encode(text);
            System.out.println("Base64 kodlangan matn: " + encodedText);
        } else if (choice == 2) {
            System.out.print("Dekodlash uchun Base64 matnni kiriting: ");
            String base64Text = scanner.nextLine();
            try {
                String decodedText = decode(base64Text);
                System.out.println("Dekodlangan matn: " + decodedText);
            } catch (IllegalArgumentException e) {
                System.out.println("Xato: Yaroqli Base64 matn kiriting!");
            }
        } else {
            System.out.println("Noto'g'ri tanlov!");
        }

        scanner.close();
    }
}
