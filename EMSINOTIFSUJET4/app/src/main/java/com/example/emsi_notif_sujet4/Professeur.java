package com.example.emsi_notif_sujet4;

public class Professeur extends Personne {
    private String profession;
    private int experience;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Professeur(Long id, String username, String password, String email, String fullname, int age, String profession, int experience) {
        super(id, username, password, email, fullname, age);
        this.profession = profession;
        this.experience = experience;
    }

    public Professeur(String username, String password, String email, String fullname, int age, String profession, int experience) {
        super(username, password, email, fullname, age);
        this.profession = profession;
        this.experience = experience;
    }
}
