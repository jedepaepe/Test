
public class DemoSearch {

    public static void main(String[] args) {
        int[] tableau = {10, 20, 30, 40, 50};

        System.out.println("Chercher l'index de l'élément de valeur 30 (c'est 2)");
        int indexCible = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (30 == tableau[i]) {
                indexCible = i;
                break;
            } else {
                System.out.println("Pas " + i + " => " + tableau[i]);
            }
        }
        System.out.println("Index de l'élément de valeur 30 est : " + indexCible);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;    // index minimum
        int high = list.length - 1; // index maximum

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return - low - 1;    // Now high < low, key not found
    }
}
