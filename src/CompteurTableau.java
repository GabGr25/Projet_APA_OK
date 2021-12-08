import java.io.FileNotFoundException;
import java.util.Arrays;

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
                for (int i = 0; i < nbElementTab; i++) {
                    if(elements[i].getMot().equals(mot)){
                        elements[i].nouvelleOccurrence();
                        return;
                    }
                }
                this.elements[nbElementTab] = new Mot(mot);
                nbElementTab++;
            }
            else {
                Mot[] nouveauTab = new Mot[elements.length * 2];
                for (int i = 0; i < nbElementTab ; i++) {
                    nouveauTab[i]=elements[i];
                }
                elements=nouveauTab;
                addOccurrence(mot);
            }
        }
    }

    @Override
    public String toString() {
        return "Fichier :  "+getNomFichier()+
                "\nNombre de mots :  " + getNbMots()+
                "\nNombre de mots de taille > 4 :  " +getNbMots5()+
                "\n-----------" +
                "\nMot les plus fréquents :  " ;
    }

    public CompteurTableau(String fichierTexte){
        super(fichierTexte);
    }

    public static void main(String[] args) {
        Compteur c;
        if (args.length<1) {
            System.err.println("nom de fichier manquant");
        }
        else {
            c = new CompteurTableau(args[0]);
            System.out.println(c);
        }
    }
}
