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

    public void creerTache(Personne createur, String description, Date date, Status status, Resolution resolution){
        lstTache.add(new Tache(createur, description, date, status, resolution));
    }

    public void annulerTache(int i){
        lstTache.remove(i);
    }

    public void consulterTache(int i){
        System.out.println(lstTache.get(i));
    }

    public void consulterTaches(){
        lstTache.forEach(System.out::println);
    }

    public void replanifierTache(){

    }
}
