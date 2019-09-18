package com.example.nadee.navigation_1;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        db = new DatabaseHelper(this);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean chkemailpass = db.emailpassword(email, password);
                if (chkemailpass==true)
                    Toast.makeText(getApplicationContext(), "Successfully LogIn", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Wrong email or Password", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void ForgotPasswordFunction(View view){
        Intent j = new Intent(this,ForgotPassword.class);
        startActivity(j);
    }

    public void RegisterFunction(View view){
        Intent i = new Intent(this,Register.class);
        startActivity(i);
    }

    public void AddMealFunction(View v){
        Intent meal = new Intent(this,AddMealActivity.class);
        startActivity(meal);
    }
}