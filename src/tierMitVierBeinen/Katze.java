package tierMitVierBeinen;

class Katze extends Vierbeiner {
    public Katze(String Name, int Zahn) {
        super(Name, Zahn);
    }

    public void miauen() {
        System.out.println("M________________________iau");
    }

    public void rennen() {
        super.rennen();
        System.out.println("  KATZENSCHNELL !!!!!!!!!!!!!");
    }
}