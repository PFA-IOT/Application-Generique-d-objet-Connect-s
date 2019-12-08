package com.example.emsi_notif_sujet4.Models;

public class Etudiant extends Personne {
    private String matricule;
    private String niveauEtudiant;
    private String filiere;
    private String departement;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNiveauEtudiant() {
        return niveauEtudiant;
    }

    public void setNiveauEtudiant(String niveauEtudiant) {
        this.niveauEtudiant = niveauEtudiant;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Etudiant(Long id, String username, String password, String email, String fullname, int age, String matricule, String niveauEtudiant, String filiere, String departement) {
        super(id, username, password, email, fullname, age);
        this.matricule = matricule;
        this.niveauEtudiant = niveauEtudiant;
        this.filiere = filiere;
        this.departement = departement;
    }

    public Etudiant(String username, String password, String email, String fullname, int age, String matricule, String niveauEtudiant, String filiere, String departement) {
        super(username, password, email, fullname, age);
        this.matricule = matricule;
        this.niveauEtudiant = niveauEtudiant;
        this.filiere = filiere;
        this.departement = departement;
    }

    public Etudiant() { }
}
