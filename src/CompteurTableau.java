import java.io.FileNotFoundException;

public class CompteurTableau extends Compteur {
    public final int TAILLE_INITIALE = 100;
    private Mot[] elements;
    private int dernier=0;


    public void addOccurrence(String mot) {
        elements=new Mot[TAILLE_INITIALE];
        if (dernier < elements.length) {
            this.elements[dernier] = new Mot(mot);
            dernier++;
        }
        else{
            int nouvelleTaille= elements.length*2;
            elements=new Mot[nouvelleTaille];
        }
    }

    public CompteurTableau(String fichierTexte){
        super(fichierTexte);
    }
}
