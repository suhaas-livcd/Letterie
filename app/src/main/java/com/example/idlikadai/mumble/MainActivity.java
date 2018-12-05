package com.example.idlikadai.mumble;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mIntroTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResources();
        addStylesToView();
    }

    /**
     * To initialize the resources with the specified resource ID
     */
    private void initResources(){
        mIntroTextView = findViewById(R.id.mainActivity_textView_Intro);
    }

    /**
     * To add the styles to the text view and other things.
     */
    private void addStylesToView(){
        if(mIntroTextView!=null){
            mIntroTextView.setTextSize(72);
            Typeface face = Typeface.createFromAsset(getAssets(),
                    "fonts/journal.ttf");
            mIntroTextView.setTypeface(face);
        }
    }
}
