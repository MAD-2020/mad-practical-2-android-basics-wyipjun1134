package sg.edu.np.WhackAMole;

/*package com.example.practical2;*/

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Whack-A-Mole" ;
    /* Hint
            - The function setNewMole() uses the Random class to generate a random value ranged from 0 to 2.
            - Feel free to modify the function to suit your program.
    */

    private Button button1;
    private Button button2;
    private Button button3;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        score = (TextView) findViewById(R.id.score);



        Log.v(TAG, "Finished Pre-Initialisation!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        setNewMole();
        Log.v(TAG, "Starting GUI!");
        final int[] scores = {0};
        score.setText(scores[0] + "");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.score);
                Log.v(TAG, "Button Left Clicked!");
                if (button1.getText().equals("*")) {
                    scores[0]++;
                    Log.v(TAG, "Hit,score added!");
                }
                else {
                    scores[0]--;
                    Log.v(TAG, "Missed,score deducted!");
                }
                score.setText(scores[0] + "");
                setNewMole();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.score);
                Log.v(TAG, "Button Middle Clicked!");
                if (button2.getText().equals("*")) {
                    scores[0]++;
                    Log.v(TAG, "Hit,score added!");
                }
                else {
                    scores[0]--;
                    Log.v(TAG, "Missed,score deducted!");
                }
                score.setText(scores[0] + "");
                setNewMole();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView scoreTextView = (TextView) findViewById(R.id.score);
                Log.v(TAG, "Button Right Clicked!");
                if (button3.getText().equals("*")) {
                    scores[0]++;
                    Log.v(TAG, "Hit,score added!");
                }
                else {
                    scores[0]--;
                    Log.v(TAG, "Missed,score deducted!");
                }
                score.setText(scores[0] + "");
                setNewMole();
            }
        });



    }


    public void setNewMole() {
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        button1.setText("O");
        button2.setText("O");
        button3.setText("O");
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if (randomLocation == 0) {
            button1.setText("*");
        } else if (randomLocation == 1) {
            button2.setText("*");
        } else {
            button3.setText("*");
        }
    }
}

