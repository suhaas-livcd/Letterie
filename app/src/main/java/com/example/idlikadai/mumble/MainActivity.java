package com.example.idlikadai.mumble;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mIntroTextView_intro_1 = null,
            mIntroTextView_intro_2 = null,
            mIntroTextView_intro_3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initResources();
        addStylesToView();
//        addAnimationEffect();
        addFadeAnimation(mIntroTextView_intro_1);
        addFadeAnimation(mIntroTextView_intro_2);
        addFadeAnimation(mIntroTextView_intro_3);
    }

    /**
     * To initialize the resources with the specified resource ID
     */
    private void initResources() {
        mIntroTextView_intro_1 = findViewById(R.id.mainActivity_textView_Intro_1);
        mIntroTextView_intro_2 = findViewById(R.id.mainActivity_textView_Intro_2);
        mIntroTextView_intro_3 = findViewById(R.id.mainActivity_textView_Intro_3);
        mIntroTextView_intro_2.setVisibility(View.GONE);
        mIntroTextView_intro_3.setVisibility(View.GONE);
    }

    /**
     * To add the styles to the text view and other things.
     */
    private void addStylesToView() {
        if (mIntroTextView_intro_1 != null) {
            mIntroTextView_intro_1.setTextSize(72);
            mIntroTextView_intro_2.setTextSize(72);
            mIntroTextView_intro_3.setTextSize(72);
            Typeface face = Typeface.createFromAsset(getAssets(),
                    "fonts/journal.ttf");
            mIntroTextView_intro_1.setTypeface(face);
            mIntroTextView_intro_2.setTypeface(face);
            mIntroTextView_intro_3.setTypeface(face);
        }
    }

    /**
     * Translate text view to the top.
     */
    private void addAnimationEffect() {
        Animation animation_1 = new TranslateAnimation
                (0, 0, 0, -600);
        Animation animation_2 = new TranslateAnimation
                (0, 0, 0, -300);
        Animation animation_3 = new TranslateAnimation
                (0, 0, 0, -100);
        animation_1.setDuration(1000);
        animation_1.setFillAfter(true);
        animation_2.setDuration(1000);
        animation_2.setFillAfter(true);
        animation_3.setDuration(1000);
        animation_3.setFillAfter(true);
        mIntroTextView_intro_1.startAnimation(animation_1);
        mIntroTextView_intro_2.setVisibility(View.VISIBLE);
        mIntroTextView_intro_2.startAnimation(animation_2);

        mIntroTextView_intro_3.setVisibility(View.VISIBLE);
        mIntroTextView_intro_3.startAnimation(animation_2);
    }

    protected AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
    protected AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);

    private void addFadeAnimation(TextView mTextView) {
        mTextView.startAnimation(fadeIn);
        mTextView.startAnimation(fadeOut);
        fadeIn.setDuration(1200);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(1200);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(4200 + fadeIn.getStartOffset());
    }
}
