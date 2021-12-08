import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

public abstract class Compteur {
    // Le compteur prend en compte un nom de fichier
    private String nomFichier;
    // Un fichier à un nombre de mot
    private int nbMots;
    private int nbMots5;

    // Une fonction abstraite permettant d'ajouter un mot au fichier
    public abstract void addOccurrence(String mot);

    public String getNomFichier() {
        return nomFichier;
    }

    public Compteur(String fichierTexte){

        this.nomFichier = fichierTexte;
        nbMots = 0;
        nbMots5 = 0;
        String[] carToDel = {".", ",", ";", "!", "(", ")", "'", "\""};
        String stringStudied;
        String[] lineParsed;
        String line;

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(nomFichier));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            lineParsed = line.split(" ");
            for (String item : lineParsed) {
                stringStudied = item.toLowerCase();
                for (String value : carToDel) {
                    while (stringStudied.contains(value)) {
                        stringStudied = stringStudied.replace(value, "");
                    }
                }
                if (stringStudied.length() > 4) {
                    addOccurrence(stringStudied);
                    nbMots5++;
                }
                nbMots++;
            }
        }
        scanner.close();
    }

    public int getNbMots5() {
        return nbMots5;
    }

    public int getNbMots() {
        return nbMots;
    }
}

