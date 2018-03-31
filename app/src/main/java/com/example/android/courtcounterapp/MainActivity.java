package com.example.android.courtcounterapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    /**
     * These variable are destroyed along with Activity
     */
    private int scorePlayerA;
    private int scorePlayerB;
    private int triesPlayerA;
    private int triesPlayerB;
    private TextView scoreViewPlayerA;
    private TextView scoreViewPlayerB;
    private TextView triesViewPlayerA;
    private TextView triesViewPlayerB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewPlayerA = (TextView) findViewById(R.id.player_a_score);
        triesViewPlayerA = (TextView) findViewById(R.id.player_a_tries);
        scoreViewPlayerB = (TextView) findViewById(R.id.player_b_score);
        triesViewPlayerB = (TextView) findViewById(R.id.player_b_tries);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        scoreViewPlayerA.setText(String.valueOf(score));
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
        triesViewPlayerA.setText(String.valueOf(score));
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
        scoreViewPlayerB.setText(String.valueOf(score));
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
        triesViewPlayerB.setText(String.valueOf(score));
    }

    /**
     * This method adding 1 point to Player B tries.
     */
    public void plusOnePointToBTries(View v) {
        triesPlayerB = triesPlayerB + 1;
        displayTriesForPlayerB(triesPlayerB);
    }

    /**
     * This method reset all scores for all teams
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

    /**
     * This method saves current Views state before screen rotation
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scorePlayerA", scorePlayerA);
        savedInstanceState.putInt("scorePlayerB", scorePlayerB);
        savedInstanceState.putInt("triesPlayerA", triesPlayerA);
        savedInstanceState.putInt("triesPlayerB", triesPlayerB);
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * This method restores current views state after screen rotation
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scorePlayerA = savedInstanceState.getInt("scorePlayerA");
        scorePlayerB = savedInstanceState.getInt("scorePlayerB");
        triesPlayerA = savedInstanceState.getInt("triesPlayerA");
        triesPlayerB = savedInstanceState.getInt("triesPlayerB");
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        displayTriesForPlayerA(triesPlayerA);
        displayTriesForPlayerB(triesPlayerB);
    }
}

