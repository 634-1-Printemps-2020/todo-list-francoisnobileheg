package main;

import main.Resolution;
import main.Status;

import java.util.Date;

public class Tache {
    private Personne createur;
    private String description;
    private Date date;
    private Status status;
    private Resolution resolution;

    public Tache(Personne createur, String description, Date date, Status status, Resolution resolution) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    public Personne getCreateur() {
        return createur;
    }

    public void setCreateur(Personne createur) {
        this.createur = createur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "createur=" + createur +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", status=" + status +
                ", resolution=" + resolution +
                '}';
    }
}
