
public class DemoStringVsCharArray {

    public static void main(String[] args) {
        int[] tableau = new int[1000];
        String string = "hello";
        char[] charArray = {'h','e','l','l','o'};
        System.out.println("string " + string);
        System.out.println(charArray);
        string += " world";
        /*charArray[5] = ' ';
        charArray[6] = 'w';
        charArray[7] = 'o';
        charArray[8] = 'r';
        charArray[9] = 'l';
        charArray[10] = 'd'; // crash */
        System.out.println("");
        String[] stringArray = {"Hello", " ", "world"};
        for (String string1 : stringArray) {
            System.out.println(string1);
        }   
    }
}
