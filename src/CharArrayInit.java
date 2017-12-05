
public class CharArrayInit {

    public static void main(String[] args) {
        char[] charArray = new char[10];
        System.out.println(charArray);
        charArray[5] = 'T';
        System.out.println(charArray);
        
        DessinateurSegmentGlobalVariable.imprimeTableau();
    }
}
