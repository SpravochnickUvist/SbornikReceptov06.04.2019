package com.example.sbornikreceptov;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecipeInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_info);

        Intent intent = getIntent();
        //получаем интент, с помощью которого запущен активити
        String receptJson = intent.getStringExtra("receptJson");
    //извлекаем json строчку из интента
        Gson gson = new Gson();
    //создание объекта для сериализаци
        Recept rb = gson.fromJson(receptJson,Recept.class);
    //десериализуем объект класса Recept
        TextView name =(TextView)findViewById(R.id.textViewName);
    //вывод информации по рецепту на активити
        name.setText(rb.getName());
    //вывод названия объекта
        TextView opis =(TextView)findViewById(R.id.textViewOpis);
    //вывод информации по рецепту на активити
        name.setText(rb.getName());
    //вывод названия объекта
        opis.setText(rb.getPolnoeOpisanie());
    //вывод названия объекта

        ImageView iv = (ImageView)findViewById(R.id.receptImageView);
        try {
            Picasso.with(iv.getContext()).load("https://firebasestorage.googleapis.com/v0/b/oneanothercookbook.appspot.com/o/omelette_PNG9.png?alt=media&token=7c056f5e-81e1-441d-afc4-8b9526b5fcde").into(iv);
        }catch (Exception e){
            Log.e("load", "Fails to load image");
        }

    }
}
