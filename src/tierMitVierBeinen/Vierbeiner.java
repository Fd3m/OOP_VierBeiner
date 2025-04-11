package tierMitVierBeinen;

class Vierbeiner {
    private String vierbeinerName;
    private int zahnZahl;

    public Vierbeiner(String pName, int pZahn) {
        vierbeinerName = pName;
        zahnZahl=pZahn;
    }

    public void setVierbeinerName(String neuName){
        vierbeinerName=neuName;
    }

    public void getVierbeinerName(){
        System.out.println(vierbeinerName);
    }

    public void getZahnZahl(){
        System.out.println(zahnZahl);
    }

    protected void rennen() {
        System.out.println(vierbeinerName + " rennt los!");
    }


}