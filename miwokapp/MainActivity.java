package com.example.miwokapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                startActivity(familyIntent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =  new Intent(v.getContext(), ColoursActivity.class);
                startActivity(in);
            }
        });

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =  new Intent(v.getContext(), NumbersActivity.class);
                startActivity(in);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });


    }

    public void openNumber(View view)
    {

        Intent in =  new Intent(this, NumbersActivity.class);
        startActivity(in);
    }

    public void openFamily(View view)
    {
        Intent in =  new Intent(this, FamilyActivity.class);
        startActivity(in);
    }

    public void openColor(View view)
    {
        Intent in =  new Intent(this, ColoursActivity.class);
        startActivity(in);
    }

    public void openPhrase(View view)
    {
        Intent in =  new Intent(this, PhrasesActivity.class);
        startActivity(in);


    }


}
