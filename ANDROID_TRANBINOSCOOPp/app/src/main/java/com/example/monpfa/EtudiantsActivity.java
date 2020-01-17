package com.example.monpfa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.jaredrummler.materialspinner.MaterialSpinner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class EtudiantsActivity extends AppCompatActivity {
    MaterialSpinner filtre;
    GridView gridView;
    String urlList = "http://192.168.43.254/android/listEtudiants.php";
    List <Etudiant> stds;
    CustomAdapter customAdapter;
    int[] imgs = {R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudiants);
        stds = new ArrayList<Etudiant>();
        gridView = findViewById(R.id.gridview);
        filtre = findViewById(R.id.filtre);
        filtre.setItems("4IIR1", "4IIR2", "4IIR3", "MIAGE1", "MIAGE2", "MIAGE3");
       // filtre.setOnItemSelectedListener();
        stds = new ArrayList<Etudiant>();
        Log.w("Yoooooooooooooooooooooo", urlList);
        test();
        //Log.w("YOOOOOOOOOOO",stds);
        // Log.w("YOOOOOOOOOOO",stds.get(i).getPrenom());

    }

    public void test(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urlList, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray etudiants = jsonObject.getJSONArray("etudiants");
                    for(int i = 0 ; i<etudiants.length();i++){
                        JSONObject etudiant = etudiants.getJSONObject(i);

                        String nom = etudiant.getString("Nom");
                        String prenom = etudiant.getString("Prenom");
                        String Tel = etudiant.getString("Tel");
                        String Email = etudiant.getString("Email");
                        String Classe = etudiant.getString("Classe");
                        Etudiant e = new Etudiant();
                        e.setNom(nom);
                        e.setPrenom(prenom);
                        e.setTel(Tel);
                        e.setEmail(Email);
                        e.setClasse(Classe);
                        Log.w("YOOOOOOOOOOOOOOO",e.getNom());//hna rah tayjib ga3 les noms mn l web service
                        //web service select * from etudiant where type = "etudiant"
                        stds.add(e);
                        // sat hna mnin kanbghi nchouf la liste tay3tini   java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
//                         Log.w("qdkjfgsufdsdgbmjlfg",stds.get(i).getNom());
                    }
                    customAdapter = new CustomAdapter(EtudiantsActivity.this,stds);
                    gridView.setAdapter(customAdapter);

                    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(getApplicationContext(),GridActivity.class);
                            intent.putExtra("nom",stds.get(position).getNom());
                            intent.putExtra("prenom",stds.get(position).getPrenom());
                            intent.putExtra("email",stds.get(position).getEmail());
                            intent.putExtra("classe",stds.get(position).getClasse());
                            intent.putExtra("tel",stds.get(position).getTel());
                            intent.putExtra("image",imgs[position]);
                            startActivity(intent);
                        }
                    });


                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(EtudiantsActivity.this, "Error catch " + e.toString(), Toast.LENGTH_SHORT).show();

                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }


    /*public void LoadTaskList(String urlList) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urlList, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray etudiants = jsonObject.getJSONArray("etudiants");
                    for (int i = 0; i < etudiants.length(); i++) {
                        JSONObject etudiant = etudiants.getJSONObject(i);
                        String Nom = etudiant.getString("Nom");
                        String Prenom = etudiant.getString("Prenom");
                        Etudiant e = new Etudiant();
                        e.setNom(Nom);
                        e.setPrenom(Prenom);
                        stds.add(e);
                        Log.w("YOOOOOOOOOOOOOOO",e.getNom());
                        Log.w("YOOOOOOOOOOOOOOO",e.getPrenom());
                        for(Etudiant e1 : stds){
                            Log.w("yooooooooooooo",e1.getNom()+" "+e1.getPrenom());
                        }
                        //Arrays.fill(stds,e);
                        Arrays.fill(imgs,R.mipmap.ic_launcher_round);
                        CustomAdapter customAdapter = new CustomAdapter();
                        gridView.setAdapter(customAdapter);
                        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int j, long id) {
                                Intent intent = new Intent(getApplicationContext(), GridActivity.class);
                                intent.putExtra("nom", stds.get(j));
                                intent.putExtra("image", imgs[j]);
                                startActivity(intent);
                            }
                        });
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    } */

    private class CustomAdapter extends ArrayAdapter<Etudiant>{


        public CustomAdapter(@NonNull Context context, List<Etudiant> stds) {
            super(context, R.layout.row_data,stds);
        }

        @Override
        public int getCount() {

            return imgs.length;
        }


        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v1 = getLayoutInflater().inflate(R.layout.row_data, null);
            TextView name = v1.findViewById(R.id.nom);
            TextView prenom = v1.findViewById(R.id.prenom);
            ImageView images = v1.findViewById(R.id.image);
            //Log.w("Teeeeest",stds.get(position).getNom());

            prenom.setText(this.getItem(position).getPrenom());
            name.setText(this.getItem(position).getNom());
            images.setImageResource(imgs[position]);
            return v1;

        }
    }


    public class Etudiant {
        private String Nom;
        private String Prenom;
        private String Email;
        private String Password;
        private String Tel;
        private String Classe;
        private String Type;

        public Etudiant(String nom, String prenom, String email, String password, String tel, String classe, String type) {
            Nom = nom;
            Prenom = prenom;
            Email = email;
            Password = password;
            Tel = tel;
            Classe = classe;
            Type = type;
        }

        public Etudiant() {
        }

        public String getClasse() {
            return Classe;
        }

        public void setClasse(String classe) {
            Classe = classe;
        }

        public String getNom() {
            return Nom;
        }

        public void setNom(String nom) {
            Nom = nom;
        }

        public String getPrenom() {
            return Prenom;
        }

        public void setPrenom(String prenom) {
            Prenom = prenom;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getTel() {
            return Tel;
        }

        public void setTel(String tel) {
            Tel = tel;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }
    }
}
