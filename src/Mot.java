public class Mot {
    private String mot;
    private int cpt;

    public Mot(String mot) {
        this.mot = mot;
        this.cpt = 1;
    }

    public void nouvelleOccurrence(){
        cpt++;
    }

    public int getOccurrence(){
        return cpt;
    }

    public String getMot(){
        return mot;
    }
}
