public class TikTakTo {
    public static void main(String[] args) {
        int[] spielerEingabe = new int[9];

        for (int i = 0; i < spielerEingabe.length; i++) {
            spielerEingabe[i] = i + 1;
        }
        spielFeld(spielerEingabe);
        System.out.println("\nDas Spielfeld ist von Feld 1 - 9 wie sie sehen. \nSie können abwechseln ein Feld auswählen und ein X/O an ihrer gewollten stelle einfügen");

        

        spielFeld(spielerEingabe);
        System.out.println("Fangen wir an");

    }

    public static void spielFeld(int[] spielfeld) {

        System.out.println("   " + spielfeld[0] + "  |  " + spielfeld[1] + "  |  " + spielfeld[2] + "\n-------------------");
        System.out.println("   " + spielfeld[3] + "  |  " + spielfeld[4] + "  |  " + spielfeld[5] + "\n-------------------");
        System.out.println("   " + spielfeld[6] + "  |  " + spielfeld[7] + "  |  " + spielfeld[8]);
    }
}