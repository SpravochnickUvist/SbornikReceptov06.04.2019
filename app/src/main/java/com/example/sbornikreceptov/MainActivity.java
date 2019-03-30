package com.example.sbornikreceptov;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;

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
        Recept recept = new Recept("Омлет", "Смешайте все ингредиенты и пожарьте", "Краткое описание");
        recept.setFoto("omlette.png");
        ArrayList<Ingerdient> ingerdients = new ArrayList<Ingerdient>();
        Ingerdient ingerdient= new Ingerdient("Яйцо куриное", 6.0, "штук");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Молоко", 200.0, "мл");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Соль поваренная");
        ingerdients.add(ingerdient);
        recept.setIngerdienti(ingerdients);
        spisokReceptov.add(recept);



        recept = new Recept("Гренки", "Порежьте хлеб, обмокните в смеси и пожарьте", "Краткое описание");
        recept.setFoto("grenki.png");
        ingerdients = new ArrayList<Ingerdient>();
        ingerdient= new Ingerdient("Хлеб", 3.0, "штуки");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Яйцо куриное", 1.0, "штука");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Молоко", 100.0, "мл");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Соль поваренная");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Растительное масло");
        ingerdients.add(ingerdient);
        recept.setIngerdienti(ingerdients);
        spisokReceptov.add(recept);

        recept = new Recept("Салат из огурцов и помидоров", "Порежь мелко, смешай и добавь специи", "Краткое описание");
        recept.setFoto("salat.png");
        ingerdients = new ArrayList<Ingerdient>();
        ingerdient= new Ingerdient("Помидор", 3.0, "штуки");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Огурец", 2.0, "штуки");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Соль поваренная");
        ingerdients.add(ingerdient);
        ingerdient= new Ingerdient("Растительное масло");
        ingerdients.add(ingerdient);
        recept.setIngerdienti(ingerdients);
        spisokReceptov.add(recept);


        ListView spisokView = (ListView) findViewById(R.id.spisok);
        ArrayAdapter<Recept> adapter = new ArrayAdapter<Recept>(this, android.R.layout.simple_list_item_1, spisokReceptov);
        spisokView.setAdapter(adapter);

        spisokView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                  Gson gson = new Gson();
                //создание объекта для сериализации рецепта
                  Recept recept= (Recept) ( (ListView) findViewById(R.id.spisok)).getItemAtPosition(position);
               //получение объекта-рецепта, на который нажал пользователь
                  String receptJson = gson.toJson(recept);
               //сериализация объекта в строку json
                  Intent intent = new Intent(MainActivity.this, RecipeInfo.class);
               //создаем интент для перехода в активити ReceptInfo
                Log.e("json",receptJson);
                  intent.putExtra("receptJson", receptJson);
               //добавляем в интент данные, сериализованные в JSON

                recept.setFoto("https://firebasestorage.googleapis.com/v0/b/oneanothercookbook.appspot.com/o/omelette_PNG9.png?alt=media&token=7c056f5e-81e1-441d-afc4-8b9526b5fcde");
                getApplicationContext().getPackageName();
                startActivity(intent);
            }
        });
    }
}
