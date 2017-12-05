
public class DemoArray {

    public static void main(String[] args) {
        //demoLitteraux();        
        int[] entierA = {1,2,3};
        System.out.println("attention copie de la référence => pointe vers le même tableau");
        int[] entierB = entierA;
        entierB[1] = 0;   // entierA est aussi modifié
        for (int i : entierA) {
            System.out.println(i);
        }
        
        System.out.println("copie profonde");
        int[] entierC = new int[entierA.length];
        for(int i=0; i<entierA.length; i++) {
            entierC[i] = entierA[i];
        }
        entierC[1] = 100;   // entierA n'est pas modifié
        for (int i : entierA) {
            System.out.println(i);
        }
        
        System.out.println("méthode pour faire cela facilement");
        int[] entierD = entierA.clone();
        entierD[1] = 500;
        for (int i : entierA) {
            System.out.println(i);  // entierA n'est pas modifié
        }
        
    }

    private static void demoLitteraux() {
        int[] entiers = new int[3];
        entiers[0] = 100;
        entiers[1] = 120;
        entiers[2] = 80;        
        int[] literaux = {100, 120, 80};        
        String[] strings = {"string1", "string2"};
    }
}
