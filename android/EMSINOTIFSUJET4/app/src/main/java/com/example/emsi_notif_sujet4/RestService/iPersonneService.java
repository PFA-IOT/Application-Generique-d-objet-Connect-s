package com.example.emsi_notif_sujet4.RestService;

import com.example.emsi_notif_sujet4.Models.Personne;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface iPersonneService {

    @GET("personnes/")
 Call<List<Personne>> getPersonnes();

@GET("personne/{id}")
Call<Personne> getPersonne(@Path("id") Long id);

@POST("addPersonne/")
Call<Personne> addPersonne(@Body Personne person);

@PUT("editPersonne/{id}")
Call<Personne> editPersonne(@Path("id") Long id, @Body  Personne person);
}
