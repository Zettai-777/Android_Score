package com.example.android.mysecondtry;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int totalScoreTeamA = 0;
    private int totalScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(int score, String team){
        TextView scoreView = team.equals("a") ? findViewById(R.id.display_score_team_a) : findViewById(R.id.display_score_team_b) ;
        scoreView.setText(String.valueOf(score));
    }

    public void addScore(View view) {
        int id = view.getId();
        switch (id){
            case R.id.free_throw_a:
                totalScoreTeamA ++;
                displayScore(totalScoreTeamA, "a");
                break;
            case R.id.free_throw_b:
                totalScoreTeamB ++;
                displayScore(totalScoreTeamB, "b");
                break;
            case R.id.plus_2_points_a:
                totalScoreTeamA += 2;
                displayScore(totalScoreTeamA, "a");
                break;
            case R.id.plus_2_points_b:
                totalScoreTeamB += 2;
                displayScore(totalScoreTeamB, "b");
                break;
            case R.id.plus_3_points_a:
                totalScoreTeamA += 3;
                displayScore(totalScoreTeamA, "a");
                break;
            case R.id.plus_3_points_b:
                totalScoreTeamB += 3;
                displayScore(totalScoreTeamB, "b");
                break;
            case R.id.reset:
                totalScoreTeamA = 0;
                totalScoreTeamB = 0;
                displayScore(totalScoreTeamA, "a");
                displayScore(totalScoreTeamB, "b");
                break;
        }
    }
}