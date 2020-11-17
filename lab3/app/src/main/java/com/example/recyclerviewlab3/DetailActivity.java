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
        details.setText(detail);
    }
}