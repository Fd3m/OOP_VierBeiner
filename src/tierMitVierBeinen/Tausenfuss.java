package tierMitVierBeinen;


public class Tausenfuss {
    private String tausenfussName;

    public Tausenfuss(String tName){
        tausenfussName=tName;
    }

    protected void rennen() {
        System.out.println(tausenfussName + " tausen Beine bewegen sich");
    }
}
