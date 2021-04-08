package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText scoreViewA;
    EditText scoreViewB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayForTeamA(int score)
    {
        scoreViewA.setText(String.valueOf(score));
    }
    public void three_points(View view)
    {
        scoreViewA = (EditText) findViewById(R.id.team_a_score);
        int score;
        score=Integer.parseInt(scoreViewA.getText().toString());
        score += 3;
        displayForTeamA(score);
    }
    public void two_points(View view)
    {
        scoreViewA = (EditText) findViewById(R.id.team_a_score);
        int score;
        score=Integer.parseInt(scoreViewA.getText().toString());
        score += 2;
        displayForTeamA(score);
    }
    public void free_throw(View view)
    {
        scoreViewA = (EditText) findViewById(R.id.team_a_score);
        int score;
        score=Integer.parseInt(scoreViewA.getText().toString());
        score += 1;
        displayForTeamA(score);
    }

    private void displayForTeamB(int score)
    {
        scoreViewB.setText(String.valueOf(score));
    }
    public void three_pointsB(View view)
    {
        scoreViewB = (EditText) findViewById(R.id.team_b_score);
        int score;
        score=Integer.parseInt(scoreViewB.getText().toString());
        score += 3;
        displayForTeamB(score);
    }
    public void two_pointsB(View view)
    {
        scoreViewB = (EditText) findViewById(R.id.team_b_score);
        int score;
        score=Integer.parseInt(scoreViewB.getText().toString());
        score += 2;
        displayForTeamB(score);
    }
    public void free_throwB(View view)
    {
        scoreViewB = (EditText) findViewById(R.id.team_b_score);
        int score;
        score=Integer.parseInt(scoreViewB.getText().toString());
        score += 1;
        displayForTeamB(score);
    }
    public void reset(View view)
    {
        scoreViewA.setText("0");
        scoreViewB.setText("0");
    }
}