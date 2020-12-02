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
        TextView fromGson = findViewById(R.id.fromGson);
        View gsonColor = findViewById(R.id.gsonColor);

        Cat murzik = new Cat("Мурзик", 9, Color.GREEN);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));
        output.setText("Кот: " + murzik.name+ "," + murzik.age + "лет, цвет:");
        //output.setText(gson.toJson(murzik));
        color.setBackgroundColor(murzik.color);

        String gsonString = "{\"name\":\"Муська\", \"age\":3, \"color\":-16711936}";
        Cat musya = gson.fromJson(gsonString,Cat.class);
        fromGson.setText("Кошка: " + musya.name + ", "+musya.age+" лет, цвет ");
        gsonColor.setBackgroundColor(musya.color);

    }
}