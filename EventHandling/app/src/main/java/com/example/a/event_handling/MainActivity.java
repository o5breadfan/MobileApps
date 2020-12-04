package com.example.a.event_handling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private GestureDetectorCompat detector;
    private TextView gesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gesture = findViewById(R.id.gestureView);
        Button btn = findViewById(R.id.button);
        TextView clickView = findViewById(R.id.clickedTV);
        TextView touchTV = findViewById(R.id.touchTV);
        TextView touchTV2 = findViewById(R.id.touchTV2);
        touchTV.setVisibility(View.INVISIBLE);
        touchTV2.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);
        clickView.setVisibility(View.INVISIBLE);
        gesture.setVisibility(View.INVISIBLE);
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
                gesture.setVisibility(View.INVISIBLE);
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
                gesture.setVisibility(View.INVISIBLE);
                ConstraintLayout layout = findViewById(R.id.activity_main);
                layout.setOnTouchListener(new View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        handleTouch(event);
                        return true;
                    }
                });
                return true;
            case R.id.CommonGestures:
                setTitle("CommonGestures");
                btn.setVisibility(View.INVISIBLE);
                touchTV.setVisibility(View.INVISIBLE);
                touchTV2.setVisibility(View.INVISIBLE);
                clickView.setVisibility(View.INVISIBLE);
                ConstraintLayout layout1 = findViewById(R.id.activity_main);
                layout1.setOnTouchListener(View::onTouchEvent);
                gesture.setVisibility(View.VISIBLE);
                detector = new GestureDetectorCompat(this,this);
                detector.setOnDoubleTapListener(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.detector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    void handleTouch(MotionEvent m){
        TextView touchView = findViewById(R.id.touchTV);
        TextView touchView2 = findViewById(R.id.touchTV2);
        int pointerCount = m.getPointerCount();
        int x,y,id,action,actionIndex;
        String actionString, TouchStatus;
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
                    break;
                case MotionEvent.ACTION_MOVE:
                    actionString = "MOVE";
                    break;
                default:
                    actionString = "";
            }
            TouchStatus = "Action: " + actionString + " Index: " + actionIndex + " ID: " + id +
                    " X: " + x + " Y: " + y;
            if(id == 0)
                touchView.setText(TouchStatus);
            else
                touchView2.setText(TouchStatus);
        }
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gesture.setText("Single tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gesture.setText("Double tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gesture.setText("Double tap event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        gesture.setText("On down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gesture.setText("On show press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gesture.setText("Single tap up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gesture.setText("Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gesture.setText("long press");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gesture.setText("Swipe");
        return true;
    }
}