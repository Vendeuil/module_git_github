import java.util.Scanner;
public class TroisTentatives {
    public static void main(String[] args) {
        for (int compteur = 1; compteur <= 20; compteur++) {
            if (compteur % 2 == 0) System.out.println(compteur);
        }
        Scanner input = new Scanner(System.in);
        int codePin = 1234;
        int codePinASaisir = 0;
        int nbress = 0;
        while (true) {
            System.out.print("Saisir le code PIN : ");
            codePinASaisir = input.nextInt();
            if (codePinASaisir == codePin) {
                System.out.println("Appareil déverouillé!!!!");
                break;
            }
            nbress++;
            if (nbress == 3) {
                System.out.println("Appareil verrouillé");
                break;
            }
            System.out.println("Code erroné, veuillez ressayer.");

        }
    }
}
