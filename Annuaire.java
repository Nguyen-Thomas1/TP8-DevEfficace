import java.util.HashMap;
import java.util.Map;

public class Annuaire {
    private Map<String, Long> contacts;

    public Annuaire() {
        this.contacts = new HashMap<>();
    }
    public void ajouterContact(String nom, long numero) {
        contacts.put(nom, numero);
    }

    public Long chercherNumero(String nom) {
        return contacts.get(nom);
    }


    public void supprimerContact(String nom) {
        contacts.remove(nom);
    }


    public void afficherAnnuaire() {
        System.out.println("--- ANNUAIRE TÉLÉPHONIQUE ---");
        for (Map.Entry<String, Long> entree : contacts.entrySet()) {
            // Note : le zéro initial d'un long n'est pas stocké en Java, d'où le "0" devant
            System.out.println(entree.getKey() + " : 0" + entree.getValue());
        }
    }

    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();

        annuaire.ajouterContact("Dupont", 612345678L);
        annuaire.ajouterContact("Martin", 798765432L);
        annuaire.ajouterContact("Bernard", 655443322L);

        annuaire.afficherAnnuaire();

        System.out.println("\nNuméro de Martin : 0" + annuaire.chercherNumero("Martin"));
    }
}
