public class CompetitionTest {
    public static void main(String[] args) {
        Competition comp = new Competition();

        // Ajout de 4 amateurs
        comp.ajouterAmateur(new Amateur("Alice", 12));
        comp.ajouterAmateur(new Amateur("Bob", 45));
        comp.ajouterAmateur(new Amateur("Charlie", 8));
        comp.ajouterAmateur(new Amateur("David", 30));


        comp.ajouterCompetiteur(new Competiteur("Lucas", 50));
        comp.ajouterCompetiteur(new Competiteur("Emma", 95));
        comp.ajouterCompetiteur(new Competiteur("Jean-Phillipe", 70));
        comp.ajouterCompetiteur(new Competiteur("Chloé", 85));

   
        comp.afficherParticipants();
    }
}
