package com.example.emsi_notif_sujet4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.emsi_notif_sujet4.Dao.DatabaseHelper;
import com.example.emsi_notif_sujet4.Models.Personne;
import com.example.emsi_notif_sujet4.RestService.Utils;
import com.example.emsi_notif_sujet4.RestService.iPersonneService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    private TextView joinText,signInText,iMac;
    private iPersonneService ipersonneService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb=new DatabaseHelper(this);

        joinText=(TextView) findViewById(R.id.account);
        signInText=(TextView) findViewById(R.id.sin);
        iMac = findViewById(R.id.imac);
        ipersonneService= Utils.getUserService();

        iMac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<Personne> call =ipersonneService.getPersonne(2L);
                call.enqueue(new Callback<Personne>() {
                    @Override
                    public void onResponse(Call<Personne> call, Response<Personne> response)
                    {
                        if(response.isSuccessful())
                        {
                            Personne results=response.body();
                            System.out.println(" value : "+results.getFullname());
                        }



                    }

                    @Override
                    public void onFailure(Call<Personne> call, Throwable t) {
                        Log.e("ERROR: ", t.getMessage());
                    }
                });
            }
        });

        joinText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);

            }
        });


    }
}
