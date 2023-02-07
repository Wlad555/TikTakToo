import java.util.Scanner;
public class TikTakTo {
    public static void spielFeld() {
        char[] spielfeld = new char[9];
        for (int i = 0; i <= spielfeld.length; i++){
            Scanner eingabe = new Scanner(System.in);
            int stelle = eingabe.nextInt();
            char symbol = eingabe.next().charAt(0);
            spielfeld[stelle - 1] = symbol;
            System.out.println("   " + spielfeld[0] + "  |  " + spielfeld[1] + "  |  " + spielfeld[2] + "\n-------------------");
            System.out.println("   " + spielfeld[3] + "  |  " + spielfeld[4] + "  |  " + spielfeld[5] + "\n-------------------");
            System.out.println("   " + spielfeld[6] + "  |  " + spielfeld[7] + "  |  " + spielfeld[8]);
        }
        // Eine if die es nicht erlaubt befüllte stellen zu befüllen und nicht aus dem werte bereich raus und das nur das symbol x und y genommen werden kann

        /*System.out.println("   " + spielfeld[0] + "  |  " + spielfeld[1] + "  |  " + spielfeld[2] + "\n-------------------");
        System.out.println("   " + spielfeld[3] + "  |  " + spielfeld[4] + "  |  " + spielfeld[5] + "\n-------------------");
        System.out.println("   " + spielfeld[6] + "  |  " + spielfeld[7] + "  |  " + spielfeld[8]);*/
    }
    public static void gewinnerTest(){

    }
    public static void main(String[] args) {
        spielFeld();
    }

}