
import java.util.Scanner;

public class DessinateurSegmentGlobalVariable {
    static char[] tableau = construitTableau();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String choix;
        do {
            gereMenuPrincipal();
            choix = input.next();
            switch (choix) {
                case "A":
                    ajouteSegment();
                    break;
                case "I":
                    imprimeTableau();
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

    public static String gereMenuPrincipal() {
        System.out.println("Tapez 'A' pour ajouter un segment");
        System.out.println("Tapez 'I' pour imprimer");
        System.out.println("Tapez 'Q' pour quitter");
        return input.next();
    }

    public static char[] construitTableau() {
        char[] tableau = new char[80];
        // optionnel : initialisation à un caractère visible
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = '.';
        }
        return tableau;
    }

    public static void imprimeTableau() {
        System.out.println(tableau);
    }

    public static void ajouteSegment() {
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
