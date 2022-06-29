import java.util.Scanner;
public class TestPremier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boucle1: while (true) {
            System.out.println("Entrez un entier > 0 ou 0 pour sortir");
            int n = sc.nextInt();
            switch(n) {
                case 0:
                    break boucle1;
                case 1:
                    System.out.println("Unité");
                    break;
                default:
                    boolean premier = true;
                    int d = 2;
                    int r = 0;
                    boucle2: while (d < n) {
                        r = n % d;
                        if (r == 0) {
                            System.out.printf("Multiple de %d\n", d);
                            premier = false;
                            break boucle2;
                        }
                        d++;
                    }
                    if (premier) System.out.printf("Le nombre %d est premier\n", n);
                    break;
            }
        }
    }
}
