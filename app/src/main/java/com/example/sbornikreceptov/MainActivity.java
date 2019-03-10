package com.example.sbornikreceptov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Recept> spisokReceptov;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: переделать под загрузку из Интернета

        spisokReceptov = new ArrayList<Recept>();
        Recept recept = new Recept("Омлет", "Описание", "Краткое описание");
        recept.setFoto("omlet.png");
        ArrayList<Ingerdient> ingerdients = new ArrayList<Ingerdient>();
        Ingerdient ingerdient= new Ingerdient("Яйцо куриное", 6.0, "штук");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Молоко", 200.0, "мл");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Соль поваренная");
        ingerdients.add(ingerdient);
        recept.setIngerdienti(ingerdients);
        spisokReceptov.add(recept);

        ArrayList<String> nazvania = new ArrayList<String>();
        for(Recept rb:spisokReceptov){
            nazvania.add(rb.getName());
        }


        ListView spisokView = (ListView) findViewById(R.id.spisok);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nazvania);
        spisokView.setAdapter(adapter);

        spisokView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, RecipeInfo.class);
                intent.putExtra("nazvanie",((ListView)view).getItemAtPosition(position).toString());
            }
        });
    }

}
