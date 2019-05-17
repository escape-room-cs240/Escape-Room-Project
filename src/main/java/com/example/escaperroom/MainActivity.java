package com.example.escaperroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;
import android.content.res.Resources;
import android.util.TypedValue;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "stonesMessage";
    private static boolean gameExists = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout titleScreenLayout = new RelativeLayout(this);
        titleScreenLayout.setBackgroundColor(Color.rgb(133, 87, 35));

        //Buttons
        Button newGameButton = new Button(this);
        newGameButton.setText("New Game");
        newGameButton.setBackgroundColor(Color.rgb(202, 204, 206));
        newGameButton.setId(1);

        Button loadGameButton = new Button(this);
        loadGameButton.setText("Load Game");
        loadGameButton.setBackgroundColor(Color.rgb(202, 204, 206));
        loadGameButton.setId(2);

        if(gameExists == false){
            loadGameButton.setClickable(false);
        }else{
            loadGameButton.setClickable(true);
        }

        //Text View Game Title
        final TextView gameTitle = new TextView(this);
        gameTitle.setText("ESCAPE ROOM");
        gameTitle.setId(3);

        //Text input widget
        EditText userInput = new EditText(this);

        //Relative Layout for widgets
        RelativeLayout.LayoutParams newGameButtonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams gameTitleDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams loadGameButtonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Button Details / Give rules to position widgets
        gameTitleDetails.addRule(RelativeLayout.ABOVE, newGameButton.getId());
        gameTitleDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        gameTitleDetails.setMargins(0, 0,0, 500);

        newGameButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        newGameButtonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        loadGameButtonDetails.addRule(RelativeLayout.BELOW, newGameButton.getId());
        loadGameButtonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        loadGameButtonDetails.setMargins(0, 35,0, 0);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300,
                r.getDisplayMetrics()
                );

        userInput.setWidth(px);

        //Add widget to layout(button is now a child of layout
        titleScreenLayout.addView(newGameButton, newGameButtonDetails);
        titleScreenLayout.addView(gameTitle, gameTitleDetails);
        titleScreenLayout.addView(loadGameButton, loadGameButtonDetails);

        //Set this activities content/display to this view
        setContentView(titleScreenLayout);

        newGameButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        gameExists = true;
                        openActivity2();
                    }
                }
        );

    }

    public void openActivity2(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }
}
