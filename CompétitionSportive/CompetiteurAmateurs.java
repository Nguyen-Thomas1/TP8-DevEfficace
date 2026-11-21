import java.util.HashSet;
import java.util.Set;

public class CompetitionAmateurs {
    private Set<Amateur> amateurs = new HashSet<>();

    public void ajouterAmateur(Amateur a) {
        amateurs.add(a);
    }

    public void afficherAmateurs() {
        for (Amateur a : amateurs) {
            System.out.println(a);
        }
    }
}
