package com.apress.gerber.lospollos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //called when user taps the submit button
    public void goBackToMenu(View view){
        //open guest apparently
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);

    }
}
