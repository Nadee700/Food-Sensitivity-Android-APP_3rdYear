package com.example.nadee.navigation_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Reports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void sessionChartFunction(View view){
        Intent i = new Intent(this,SessionChartsActivity.class);
        startActivity(i);
    }

    public void HealthImplementFunction(View view){
        Intent i = new Intent(this,HealthImpTechActivity.class);
        startActivity(i);
    }

    public void SessionCalenderFunction(View v){
        Intent i = new Intent(this,SessionCalender.class);
        startActivity(i);
    }
}
