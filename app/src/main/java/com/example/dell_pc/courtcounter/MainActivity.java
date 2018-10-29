package com.example.dell_pc.courtcounter;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnTeamAadd3,btnTeamAadd2,btnTeamAFreeThrow,
            btnTeamBadd3,btnTeamBadd2, btnTeamBFreeThrow,
    btnReset,btnrate;
   TextView tvteamAscore,tvteamBscore;
   RatingBar ratingBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnrate=(Button)findViewById(R.id.btnrate);
        ratingBar=(RatingBar)findViewById(R.id.ratingbar);

        btnReset = (Button)findViewById(R.id.btnreset);

        tvteamAscore = (TextView )findViewById(R.id.tvteamAscore);
        tvteamBscore = (TextView) findViewById(R.id.tvteamBscore);

        btnTeamAadd3 = (Button) findViewById(R.id.btnTeamAadd3);
        btnTeamAadd2 = (Button) findViewById(R.id.btnTeamAadd2);
        btnTeamAFreeThrow = (Button) findViewById(R.id.btnTeamAFreeThrow);

        btnTeamBadd3 = (Button) findViewById(R.id.btnTeamBadd3);
        btnTeamBadd2 = (Button) findViewById(R.id.btnTeamBadd2);
        btnTeamBFreeThrow = (Button) findViewById(R.id.btnTeamBFreeThrow);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvteamAscore.setText("0");
                tvteamBscore.setText("0");
                ratingBar.setRating(0);
            }
        });

        btnTeamAFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamAscore.getText().toString());
                tvteamAscore.setText(String.valueOf(score + 1));
            }
        });

        btnTeamAadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamAscore.getText().toString());
                tvteamAscore.setText(String.valueOf(score + 2));
            }
        });

        btnTeamAadd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamAscore.getText().toString());
                tvteamAscore.setText(String.valueOf(score + 3));
            }
        });





        btnTeamBFreeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamBscore.getText().toString());
                tvteamBscore.setText(String.valueOf(score + 1));
            }
        });
        btnTeamBadd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamBscore.getText().toString());
                tvteamBscore.setText(String.valueOf(score + 2));
            }
        });
        btnTeamBadd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(tvteamBscore.getText().toString());
                tvteamBscore.setText(String.valueOf(score + 3));
            }
        });

        btnrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rate=String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),rate,Toast.LENGTH_SHORT).show();
            }
        });


    }

    }
