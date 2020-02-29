package main.metier;

import main.domaine.Resolution;
import main.domaine.Status;
import main.domaine.Personne;
import main.domaine.Tache;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionnaireTache {
    private List<Tache> lstTache;

    public GestionnaireTache() {
        this.lstTache = new ArrayList<Tache>();
    }

    public void creerTache(Personne createur, String description, Date date, Status status, Resolution resolution) {
        lstTache.add(new Tache(createur, description, date, status, resolution));
    }

    /**
     * Supprime la tâche qui correspond à l'index
     * @param i : index de la Tache
     */
    public void annulerTache(int i) {
        lstTache.remove(i);
    }

    /**
     * Affiche la Tache qui correspond à l'index
     * @param i : index de la Tache
     */
    public void consulterTache(int i) {
        System.out.println(lstTache.get(i));
    }

    /**
     * Affiche toutes les Tache de la liste
     */
    public void consulterTaches() {
        lstTache.forEach(System.out::println);
    }

    /**
     * Change la date de la Tache qui correspond à l'index
     * @param i : index
     * @param date : date
     */
    public void replanifierTache(int i, Date date) {
        lstTache.get(i).setDate(date);
    }
}
