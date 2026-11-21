public class Competiteur extends Participant implements Comparable<Competiteur> {
    public Competiteur(String nom, int score) {
        super(nom, score);
    }

    @Override
    public int compareTo(Competiteur autre) {

        int diff = Integer.compare(autre.getScore(), this.getScore());
        if (diff != 0) {
            return diff;
        }
    
        return this.getNom().compareTo(autre.getNom());
    }

    @Override
    public String toString() {
        return "[Compétiteur] " + super.toString();
    }
}
