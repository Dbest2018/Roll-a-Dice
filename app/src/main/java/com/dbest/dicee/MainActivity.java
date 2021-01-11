package com.dbest.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = "Dicee";
    private ImageView leftDice;
    private ImageView rightDice;
    private Button rollDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftDice = findViewById(R.id.left_dice);
        rightDice = findViewById(R.id.right_dice);
        rollDice = findViewById(R.id.roll_button);

        final int[] diceImages = { R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random  rand = new Random();

                int number = rand.nextInt(6);
                Log.d(LOG_TAG, "random number " + number + " generated");
                leftDice.setImageResource(diceImages[number]);

                int anotherNumber = rand.nextInt(6);
                Log.d(LOG_TAG, "random number " + anotherNumber + " generated");
                rightDice.setImageResource(diceImages[anotherNumber]);
            }
        });
    }
}
