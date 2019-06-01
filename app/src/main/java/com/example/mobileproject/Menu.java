package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void monta_pcs (View v){

        startActivity(new Intent(this, PcsActivity.class));
    }

    public void pcs_prontos (View v){

        startActivity(new Intent(this, Pc.class));
    }






}
