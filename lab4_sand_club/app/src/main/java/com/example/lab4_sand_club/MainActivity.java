package com.example.lab4_sand_club;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = findViewById(R.id.outputTView);
        View color = findViewById(R.id.colorCat);

        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 9;
        murzik.color = Color.GREEN;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));
        output.setText("Кот: " + murzik.name+ "," + murzik.age + "лет, цвет:");
        color.setBackgroundColor(murzik.color);

    }
}