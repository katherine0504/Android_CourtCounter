package com.example.kathy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int scoreA = 0;
    public int scoreB = 0;

    public void displayScoreA()
    {
        TextView scoreView = (TextView) findViewById(R.id.recordA);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void plus3A(View v)
    {
        scoreA = scoreA + 3;
        displayScoreA();
    }

    public void plus2A(View v)
    {
        scoreA = scoreA + 2;
        displayScoreA();
    }

    public void freeThrowA(View v)
    {
        scoreA = scoreA + 1;
        displayScoreA();
    }

    public void displayScoreB()
    {
        TextView scoreView = (TextView) findViewById(R.id.recordB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void plus3B(View v)
    {
        scoreB = scoreB + 3;
        displayScoreB();
    }

    public void plus2B(View v)
    {
        scoreB = scoreB + 2;
        displayScoreB();
    }

    public void freeThrowB(View v)
    {
        scoreB = scoreB + 1;
        displayScoreB();
    }

    public void reset(View v)
    {
        scoreA = 0;
        scoreB = 0;
        displayScoreA();
        displayScoreB();
    }
}
