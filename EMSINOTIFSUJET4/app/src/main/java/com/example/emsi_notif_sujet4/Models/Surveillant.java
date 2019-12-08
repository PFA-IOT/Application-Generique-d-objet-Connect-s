package com.example.emsi_notif_sujet4.Models;

import com.example.emsi_notif_sujet4.Models.Personne;

public class Surveillant extends Personne {
    private String professionExact;

    public String getProfessionExact() {
        return professionExact;
    }

    public void setProfessionExact(String professionExact) {
        this.professionExact = professionExact;
    }

    public Surveillant(String username, String password, String email, String fullname, int age, String professionExact) {
        super(username, password, email, fullname, age);
        this.professionExact = professionExact;
    }


}
