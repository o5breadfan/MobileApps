package com.example.a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        TextView clickView = findViewById(R.id.clickedTV);
        btn.setVisibility(View.INVISIBLE);
        clickView.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Button btn = (Button) findViewById(R.id.button);
        TextView clickView = findViewById(R.id.clickedTV);
        TextView touchTV = findViewById(R.id.touchTV);
        TextView touchTV2 = findViewById(R.id.touchTV2);

        switch (id){
            case R.id.ButtonClick:
                setTitle("ButtonClick");
                btn.setVisibility(View.VISIBLE);
                clickView.setVisibility(View.VISIBLE);
                touchTV.setVisibility(View.INVISIBLE);
                touchTV2.setVisibility(View.INVISIBLE);
                btn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        TextView clickView = findViewById(R.id.clickedTV);
                        clickView.setText("Button clicked");
                    }
                }
                );

                btn.setOnLongClickListener(new View.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView clickView = findViewById(R.id.clickedTV);
                        clickView.setText("Long Button click");
                        return true;
                    }
                }
                );
                return true;
            case R.id.MotionEvent:
                setTitle("MotionEvent");
                clickView.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.INVISIBLE);
                touchTV.setVisibility(View.VISIBLE);
                touchTV2.setVisibility(View.VISIBLE);
                ConstraintLayout layout = findViewById(R.id.activity_main);
                layout.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        handleTouch(event);
                        return false;
                    }
                });
                return true;
            case R.id.CommonGestures:
                setTitle("CommonGestures");
                btn.setVisibility(View.INVISIBLE);
                touchTV.setVisibility(View.INVISIBLE);
                touchTV2.setVisibility(View.INVISIBLE);
                clickView.setVisibility(View.INVISIBLE);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    void handleTouch(MotionEvent m){
        TextView touchView = findViewById(R.id.touchTV);
        TextView touchView2 = findViewById(R.id.touchTV2);
        int pointerCount = m.getPointerCount();
        int x,y,id,action,actionIndex;
        String actionString;
        for(int i = 0; i < pointerCount; i++){
            x = (int) m.getX(i);
            y = (int) m.getY(i);
            id = m.getPointerId(i);
            action = m.getActionMasked();
            actionIndex = m.getActionIndex();
            switch (action){
                case MotionEvent.ACTION_DOWN:
                    actionString = "DOWN";
                    break;
                case MotionEvent.ACTION_UP:
                    actionString = "UP";
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    actionString = "PNTR DOWN";
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    actionString = "PNTR UP";
            }
        }

    }
}