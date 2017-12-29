package com.udacity.gokul.scorekeeper;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.udacity.gokul.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int Score_Team_A=0,Score_Team_B=0;
    int Foul_Count_Team_A=0,Foul_Count_Team_B=0;
    int Red_Count_Team_A=0,Red_Count_Team_B=0;
    int Yellow_Count_Team_A=0,Yellow_Count_Team_B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Reset_Score(View view) {
        Score_Team_A=0;
        Score_Team_B=0;
        Foul_Count_Team_A=0;
        Foul_Count_Team_B=0;
        Red_Count_Team_A=0;
        Red_Count_Team_B=0;
        Yellow_Count_Team_A=0;
        Yellow_Count_Team_B=0;
        set_Team_A_Score();
        set_Team_B_Score();
        set_Team_A_Foul_Score();
        set_Team_B_Foul_Score();
        set_Team_A_Red_Score();
        set_Team_B_Red_Score();
        set_Team_A_Yellow_Score();
        set_Team_B_Yellow_Score();
    }

    public void set_Team_A_Score(){

        TextView Team_A_Score=(TextView)findViewById(R.id.txt_team_a_score);
        Team_A_Score.setText(String.valueOf(Score_Team_A));

    }

    public void set_Team_B_Score(){
        TextView Team_B_Score=(TextView)findViewById(R.id.txt_team_b_score);
        Team_B_Score.setText(String.valueOf(Score_Team_B));

    }

    public void set_Team_A_Foul_Score(){
        TextView Team_A_Foul_Score=(TextView)findViewById(R.id.txt_foul_score_a);
        Team_A_Foul_Score.setText("F: "+String.valueOf(Foul_Count_Team_A));

    }

    public void set_Team_B_Foul_Score(){
        TextView Team_B_Foul_Score=(TextView)findViewById(R.id.txt_foul_score_b);
        Team_B_Foul_Score.setText("F: "+String.valueOf(Foul_Count_Team_B));
    }

    public void set_Team_A_Yellow_Score(){
        TextView Team_A_Yellow_Score=(TextView)findViewById(R.id.txt_yellow_score_a);
        Team_A_Yellow_Score.setText("Y: "+String.valueOf(Yellow_Count_Team_A));
    }

    public void set_Team_B_Yellow_Score(){
        TextView Team_B_Yellow_Score=(TextView)findViewById(R.id.txt_yellow_score_b);
        Team_B_Yellow_Score.setText("Y: "+String.valueOf(Yellow_Count_Team_B));
    }

    public void set_Team_A_Red_Score(){
        TextView Team_A_Red_Score=(TextView)findViewById(R.id.txt_red_score_a);
        Team_A_Red_Score.setText("R: "+String.valueOf(Red_Count_Team_A));
    }

    public void set_Team_B_Red_Score(){
        TextView Team_B_Red_Score=(TextView)findViewById(R.id.txt_red_score_b);
        Team_B_Red_Score.setText("R: "+String.valueOf(Red_Count_Team_B));
    }

    public void team_A_Goal_Plus(View view) {
        Score_Team_A+=1;
        set_Team_A_Score();
    }

    public void team_B_Goal_Plus(View view) {
        Score_Team_B+=1;
        set_Team_B_Score();
    }

    public void team_A_Goal_Minus(View view) {
        Score_Team_A+=-1;
        if (Score_Team_A < 0){
            Score_Team_A=0;
        }
        set_Team_A_Score();
    }

    public void team_B_Goal_Minus(View view) {
        Score_Team_B+=-1;
        if (Score_Team_B < 0){
            Score_Team_B=0;
        }
        set_Team_B_Score();
    }

    public void team_A_Yellow_Card_Plus(View view) {
        Yellow_Count_Team_A+=1;
        set_Team_A_Yellow_Score();
    }

    public void team_A_Yellow_Card_Minus(View view) {
        Yellow_Count_Team_A+=-1;
        if (Yellow_Count_Team_A < 0){
            Yellow_Count_Team_A=0;
        }
        set_Team_A_Yellow_Score();
    }


    public void team_B_Yellow_Card_Plus(View view) {
        Yellow_Count_Team_B+=1;
        set_Team_B_Yellow_Score();
    }

    public void team_B_Yellow_Card_Minus(View view) {
        Yellow_Count_Team_B+=-1;
        if (Yellow_Count_Team_B < 0){
            Yellow_Count_Team_B=0;
        }
        set_Team_B_Yellow_Score();
    }

    public void team_A_Red_Card_Plus(View view) {
        Red_Count_Team_A+=1;
        set_Team_A_Red_Score();
    }

    public void team_B_Red_Card_Plus(View view) {
        Red_Count_Team_B+=1;
        set_Team_B_Red_Score();
    }

    public void team_A_Red_Card_Minus(View view) {
        Red_Count_Team_A+=-1;
        if (Red_Count_Team_A < 0){
            Red_Count_Team_A=0;
        }
        set_Team_A_Red_Score();
    }

    public void team_B_Red_Card_Minus(View view) {
        Red_Count_Team_B+=-1;
        if (Red_Count_Team_B < 0){
            Red_Count_Team_B=0;
        }
        set_Team_B_Red_Score();
    }

    public void team_A_Foul_Card_Plus(View view) {
        Foul_Count_Team_A+=1;
        set_Team_A_Foul_Score();
    }

    public void team_B_Foul_Card_Plus(View view) {
        Foul_Count_Team_B+=1;
        set_Team_B_Foul_Score();

    }

    public void team_A_Foul_Card_Minus(View view) {
        Foul_Count_Team_A+=-1;
        if (Foul_Count_Team_A < 0){
            Foul_Count_Team_A=0;
        }
        set_Team_A_Foul_Score();
    }

    public void team_B_Foul_Card_Minus(View view) {
        Foul_Count_Team_B+=-1;
        if (Foul_Count_Team_B < 0){
            Foul_Count_Team_B=0;
        }
        set_Team_B_Foul_Score();
    }

}
