package org.esprit;

import java.util.List;

public class Promotion {
    private  int year;
    private List<Etudiant> Etudiants;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Etudiant> getEtudiants() {
        return Etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        Etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "year=" + year +
                ", Etudiants=" + Etudiants +
                '}';
    }
}
