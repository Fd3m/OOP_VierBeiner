package tierMitVierBeinen;// aus: https://www.codeadventurer.de/?p=1375
//
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        System.out.println("Klassen lernen: ");

        Vierbeiner NOWBODY = new Vierbeiner("einVierBeinTier", 9);
        Hund hund1=new Hund("FiFi",1);
        Katze katze1=new Katze("Karotte", 11);
        Meerschwein sau1=new Meerschwein("Pinat", 99);
        Tausenfuss beini= new Tausenfuss("Wirbelwind");

        hund1.rennen();
        hund1.bellen();
        hund1.setVierbeinerName("FiFi der Zweite");
        hund1.rennen();
        katze1.miauen();
        katze1.rennen();
        katze1.setVierbeinerName("neuKarotte");
        katze1.rennen();
        sau1.knabbern();
        sau1.setVierbeinerName("pINAT");
        sau1.rennen();
        beini.rennen();
        beini.rennen();
        katze1.getVierbeinerName();
        NOWBODY.rennen();
        sau1.getZahnZahl();
    }
}

