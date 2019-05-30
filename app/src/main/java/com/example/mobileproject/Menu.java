package com.example.mobileproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void pcs_prontos (View v){

        setContentView(R.layout.pcs_prontos);
    }

    public void pcs (View v){

        setContentView(R.layout.pcs);
    }






}
