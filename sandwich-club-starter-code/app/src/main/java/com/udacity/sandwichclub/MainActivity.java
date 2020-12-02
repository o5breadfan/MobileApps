package com.udacity.sandwichclub;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.udacity.sandwichclub.model.Sandwich;
import com.udacity.sandwichclub.utils.JsonUtils;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Sandwich> SandwichList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rview = findViewById(R.id.sandwiches_rview);
        String[] sandwiches = getResources().getStringArray(R.array.sandwich_names);
        String[] sandList = getResources().getStringArray(R.array.sandwich_details);

        SandwichList = new ArrayList<>();
        for (int i = 0; i < sandwiches.length; i++) {
            String json = sandList[i];
            Sandwich sandwich = null;
            try {
                sandwich = JsonUtils.parseSandwichJson(json);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            SandwichList.add(sandwich);
        }

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rview.setLayoutManager(mLayoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(SandwichList);
        rview.setAdapter(adapter);
    }
}
