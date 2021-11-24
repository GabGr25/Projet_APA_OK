import java.io.FileNotFoundException;

public class CompteurTableau extends Compteur {
    public final int TAILLE_INITIALE = 100;
    private Mot[] elements;
    private int dernier=0;


    public void addOccurrence(String mot) {
        elements=new Mot[TAILLE_INITIALE];
        if (elements.length != TAILLE_INITIALE) {
            this.elements[dernier] = new Mot(mot);
            dernier++;
        }
        else{
            elements=new Mot[TAILLE_INITIALE*2];

        }
    }

    public CompteurTableau( Mot[] elements, int dernier) throws FileNotFoundException {
        super();

    }
}
