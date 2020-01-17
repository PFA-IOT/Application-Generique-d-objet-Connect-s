package com.example.monpfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfesseurActivity extends AppCompatActivity {

    GridView gridView;
    String urlList = "http://192.168.1.4/android/listEtudiants.php";
    String[] stds = {"Amigooo", "Belasla", "Buffa", "Ghanem","Belatar"};
    int[] imgs = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professeur);
        gridView = findViewById(R.id.gridview);
        ProfesseurActivity.CustomAdapter customAdapter = new ProfesseurActivity.CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(), GridActivity.class);
                intent.putExtra("nom", stds[i]);
                intent.putExtra("image", imgs[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View v1 = getLayoutInflater().inflate(R.layout.row_data, null);

            TextView name = v1.findViewById(R.id.nom);
            ImageView images = v1.findViewById(R.id.image);

            name.setText(stds[i]);
            images.setImageResource(imgs[i]);
            return v1;

        }
    }

}
