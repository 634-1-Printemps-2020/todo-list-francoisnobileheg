package main;

import java.util.ArrayList;
import java.util.Date;

public class GestionnaireTache {
    private ArrayList<Tache> lstTache;

    public void creerTache(Personne createur, String description, Date date, Status status, Resolution resolution){
        lstTache.add(new Tache(createur, description, date, status, resolution));
    }

    public void annulerTache(Tache t){
        lstTache.remove(t);
    }

    public ArrayList<Tache> consulterTaches(){
        return lstTache;
    }
}
