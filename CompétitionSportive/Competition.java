import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Competition {
    private Set<Amateur> amateurs;
    private Set<Competiteur> competiteurs;

    public Competition() {
        this.amateurs = new HashSet<>();         // Non trié
        this.competiteurs = new TreeSet<>();     // Toujours trié automatiquement
    }

    public void ajouterAmateur(Amateur a) {
        amateurs.add(a);
    }

    public void ajouterCompetiteur(Competiteur c) {
        competiteurs.add(c);
    }

    public void afficherParticipants() {
        System.out.println("--- CLASSEMENT DES COMPÉTITEURS (Triés) ---");
        for (Competiteur c : competiteurs) {
            System.out.println(c);
        }

        System.out.println("\n--- LISTE DES AMATEURS (Non classés) ---");
        for (Amateur a : amateurs) {
            System.out.println(a);
        }
    }
}
