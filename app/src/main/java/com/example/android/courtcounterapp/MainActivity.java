package com.example.android.courtcounterapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;
    int triesPlayerA = 0;
    int triesPlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adding 1 point to Player A score.
     */
    public void plusOnePointToA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
        triesPlayerA = triesPlayerA + 1;
        displayTriesForPlayerA(triesPlayerA);
    }

    /**
     * Displays the tries for Player A.
     */
    public void displayTriesForPlayerA(int score) {
        TextView triesView = (TextView) findViewById(R.id.player_a_tries);
        triesView.setText(String.valueOf(score));
    }

    /**
     * This method adding 1 point to Player A tries.
     */
    public void plusOnePointToATries(View v) {
        triesPlayerA = triesPlayerA + 1;
        displayTriesForPlayerA(triesPlayerA);
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adding 1 point to Player B score.
     */
    public void plusOnePointToB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
        triesPlayerB = triesPlayerB + 1;
        displayTriesForPlayerB(triesPlayerB);
    }

    /**
     * Displays the tries for Player B.
     */
    public void displayTriesForPlayerB(int score) {
        TextView triesView = (TextView) findViewById(R.id.player_b_tries);
        triesView.setText(String.valueOf(score));
    }

    /**
     * This method adding 1 point to Player B tries.
     */
    public void plusOnePointToBTries(View v) {
        triesPlayerB = triesPlayerB + 1;
        displayTriesForPlayerB(triesPlayerB);
    }

    /**
     * This method reset all scores for all teams.
     */
    public void resetAllScores(View v) {
        scorePlayerB = 0;
        scorePlayerA = 0;
        triesPlayerA = 0;
        triesPlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displayTriesForPlayerA(triesPlayerA);
        displayTriesForPlayerB(triesPlayerB);
    }
}

