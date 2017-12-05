
import java.util.Scanner;

public class DessinateurSegment {

    public static void main(String[] args) {
        char[] tableau = construitTableau();
        String choix;
        Scanner input = new Scanner(System.in);
        do {
            gereMenuPrincipal(input);
            choix = input.next();
            switch (choix) {
                case "A":
                    ajouteSegment(input, tableau);
                    break;
                case "I":
                    imprimeTableau(tableau);
                    break;
                case "Q":
                    break;
                default:
                    System.out.println(choix + " est une commande non supportée");
            }
        } while (!choix.equals("Q"));
        System.out.println("Au revoir");
        input.close();
    }

    private static String gereMenuPrincipal(Scanner input) {
        System.out.println("Tapez 'A' pour ajouter un segment");
        System.out.println("Tapez 'I' pour imprimer");
        System.out.println("Tapez 'Q' pour quitter");
        return input.next();
    }

    private static char[] construitTableau() {
        char[] tableau = new char[80];
        // optionnel : initialisation à un caractère visible
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = '.';
        }
        return tableau;
    }

    private static void imprimeTableau(char[] tableau) {
        System.out.println(tableau);
    }

    private static void ajouteSegment(Scanner input, char[] tableau) {
        System.out.print("caractere du segment: ");
        char caractere = input.next().charAt(0);
        System.out.print("position du segment: ");
        int position = input.nextInt();
        System.out.print("longueur du segment: ");
        int longueur = input.nextInt();
        for (int i = position; i < position + longueur; i++) {
            tableau[i] = caractere;
        }
    }

}
