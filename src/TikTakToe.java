import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TikTakToe {
    // static char[] spielfeld = new char[9];
    static char[] spielfeld = {'1','2','3','4','5','6','7','8','9'};

    public static void spielFeld() {
            System.out.println("   " + spielfeld[0] + "  |  " + spielfeld[1] + "  |  " + spielfeld[2] + "\n-------------------");
            System.out.println("   " + spielfeld[3] + "  |  " + spielfeld[4] + "  |  " + spielfeld[5] + "\n-------------------");
            System.out.println("   " + spielfeld[6] + "  |  " + spielfeld[7] + "  |  " + spielfeld[8]);
    }
    public static boolean gewinnerTest(){
        if(spielfeld[0]=='X' && spielfeld[1]=='X' && spielfeld[2]=='X' || spielfeld[3]=='X' && spielfeld[4]=='X' && spielfeld[5]=='X' || spielfeld[6]=='X' && spielfeld[7]=='X' && spielfeld[8]=='X' || spielfeld[0]=='X' && spielfeld[4]=='X' && spielfeld[8]=='X' || spielfeld[2]=='X' && spielfeld[4]=='X' && spielfeld[6]=='X' || spielfeld[0]=='X' && spielfeld[3]=='X' && spielfeld[6]=='X' || spielfeld[1]=='X' && spielfeld[4]=='X' && spielfeld[7]=='X' || spielfeld[2]=='X' && spielfeld[5]=='X' && spielfeld[8]=='X'){
            System.out.println("SPIELER 1 SIEGT!!!");
            return true;
        }
        if(spielfeld[0]=='O' && spielfeld[1]=='O' && spielfeld[2]=='O' || spielfeld[3]=='O' && spielfeld[4]=='O' && spielfeld[5]=='O' || spielfeld[6]=='O' && spielfeld[7]=='O' && spielfeld[8]=='O' || spielfeld[0]=='O' && spielfeld[4]=='O' && spielfeld[8]=='O' || spielfeld[2]=='O' && spielfeld[4]=='O' && spielfeld[6]=='O'|| spielfeld[0]=='O' && spielfeld[3]=='O' && spielfeld[6]=='O' || spielfeld[1]=='O' && spielfeld[4]=='O' && spielfeld[7]=='O' || spielfeld[2]=='O' && spielfeld[5]=='O' && spielfeld[8]=='O'){
            System.out.println("SPIELER 2 SIEGT!!!");
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        spielFeld();
        System.out.println("Hier sehen sie die Position 1-9 zwischen denen sie Wählen können. \nBsp: 1 X für die erste Reihe erste Spalte.");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < spielfeld.length; i++){
            int stelle = sc.nextInt();
            char symbol = sc.next().charAt(0);


            // Anstatt symbol zu übergeben sofort ein symbol einfügen an gewollter stelle

            spielfeld[stelle - 1] = Character.toUpperCase(symbol);
            spielFeld();
            if(gewinnerTest()){
                break;
            }

            if (i == spielfeld.length-1)
            {
                System.out.println("Das Spiel ist leider Unentschieden.");
                break;
            }
        }

    }
}

// SP1 = x oder SP2 = o -> wenn 1 -> x -> 1 x 1