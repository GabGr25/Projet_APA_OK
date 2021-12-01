import java.io.FileNotFoundException;

public class CompteurTableau extends Compteur {
    public final int TAILLE_INITIALE = 100;
    private Mot[] elements;
    private int nbElementTab=0;


    public void addOccurrence(String mot) {
        if(elements==null) {
            elements = new Mot[TAILLE_INITIALE];
        }
        else{
            if (nbElementTab < elements.length) {
                //TODO
                //Mot.getMot==mot
                this.elements[nbElementTab] = new Mot(mot);
                nbElementTab++;
            } else {
                Mot[] nouveauTab = new Mot[elements.length * 2];
                for (int i = 0; i < nbElementTab ; i++) {
                    nouveauTab[i]=elements[i];
                }
                elements=nouveauTab;
            }
        }
    }

    public CompteurTableau(String fichierTexte){
        super(fichierTexte);
    }
}
