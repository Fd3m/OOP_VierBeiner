package tierMitVierBeinen;

class Hund extends Vierbeiner {
    public Hund(String pHundName, int Zahn){
        super(pHundName, Zahn);
    }

    public void bellen() {
        System.out.println("WUFF!");
    }
    public void rennen() {
        super.rennen();
        System.out.println("  Hunde laufen langsam los");
    }

}