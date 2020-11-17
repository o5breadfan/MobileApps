package com.example.recyclerviewlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle arguments = getIntent().getExtras();
        String detail = arguments.get("ARG_ITEM_ID").toString();

        TextView details = findViewById(R.id.details);
        StringBuilder sb = new StringBuilder();
        sb.append("Информация об элементе: ").append(detail);
        for(int j = 0; j < Integer.parseInt(detail); j++){
            sb.append("\n Детальная информация. ");
        }
        details.setText(sb);
    }
}