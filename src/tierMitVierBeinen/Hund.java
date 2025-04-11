package tierMitVierBeinen;

class Hund extends Vierbeiner {
    public Hund(String pHundName, int Zahn){
        super(pHundName, Zahn);
    }

    public void bellen() {
        System.out.println("WAuWAuuu!");
    }
    public void rennen() {
        super.rennen();
        System.out.println(" läuft langsam los");
    }

}