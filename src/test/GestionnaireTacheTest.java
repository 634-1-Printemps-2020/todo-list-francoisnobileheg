package test;

import static org.junit.Assert.*;

import main.domaine.Personne;
import main.domaine.Resolution;
import main.domaine.Status;
import main.domaine.Tache;
import main.metier.GestionnaireTache;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

public class GestionnaireTacheTest {

    Personne p = new Personne("Dupont", "Jean");

    @Test
    public void creerTache() {
        GestionnaireTache gt = new GestionnaireTache();
        gt.creerTache(p,"Nourirr le chien", new Date(), Status.open, Resolution.ignored);
        gt.consulterTaches();
    }

    @Test
    public void annulerTache() {
        GestionnaireTache gt = new GestionnaireTache();
        gt.creerTache(p,"Nourirr le chien", new Date(), Status.open, Resolution.ignored);
        gt.consulterTaches();
        gt.annulerTache(0);
        gt.consulterTaches();
    }

    @Test
    public void consulterTache() {
        GestionnaireTache gt = new GestionnaireTache();
        gt.creerTache(p,"Nourirr le chien", new Date(), Status.open, Resolution.ignored);
        gt.consulterTache(0);
    }

    @Test
    public void consulterTaches() {
        GestionnaireTache gt = new GestionnaireTache();
        gt.creerTache(p,"Nourirr le chien", new Date(), Status.open, Resolution.ignored);
        gt.creerTache(p,"Nourirr le chat", new Date(), Status.open, Resolution.ignored);
        gt.consulterTaches();
    }

    @Test
    public void replanifierTache() {
        GestionnaireTache gt = new GestionnaireTache();
        gt.creerTache(p,"Nourirr le chien", new Date(), Status.open, Resolution.ignored);
        gt.consulterTaches();
        gt.replanifierTache(0, new Date());
        gt.consulterTaches();
    }
}