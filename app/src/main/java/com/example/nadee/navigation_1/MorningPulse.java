package com.example.nadee.navigation_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MorningPulse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning_pulse);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void NextStepFunction(View v) {
        Intent i = new Intent(this, AddMealActivity.class);
        startActivity(i);
    }

    public void pulsefunction(View v) {
        Intent i = new Intent(this, AddMealActivity.class);
        startActivity(i);
    }
}
