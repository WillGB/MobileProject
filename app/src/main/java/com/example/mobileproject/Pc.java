package com.example.mobileproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Pc extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pcs_prontos);

        ImageButton imageButtonpc5 = (ImageButton)findViewById(R.id.pc5);
        imageButtonpc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-i3-8100-geforce-gtx-1660-6gb-galax-oc-8gb-ddr4-hd-1tb-500w-magpie-2";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });

        ImageButton imageButtonpc6 = (ImageButton)findViewById(R.id.pc6);
        imageButtonpc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-skycutter-ryzen-7-2700x-geforce-gtx-1660-6gb-galax-oc-8gb-ddr4-hd-1tb-600w-frillback-rgb";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });

        ImageButton imageButtonpc2 = (ImageButton)findViewById(R.id.pc2);
        imageButtonpc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-amd-athlon-200ge-geforce-gtx-1650-4gb-8gb-ddr4-hd-1tb-400w-magpie-3";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });
        ImageButton imageButtonpc9 = (ImageButton)findViewById(R.id.pc9);
        imageButtonpc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gaming-highflyer-i9-9900k-geforce-rtx-2080-8gb-gigabyte-gaming-oc-16gb-ddr4-hd-1tb-600w-frillback-rgb";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });
        ImageButton imageButtonpc8 = (ImageButton)findViewById(R.id.pc8);
        imageButtonpc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gaming-highflyer-i7-9700k-geforce-rtx-2070-8gb-16gb-ddr4-hd-1tb-600w-seraph";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });

        ImageButton imageButtonpc7 = (ImageButton)findViewById(R.id.pc7);
        imageButtonpc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-ryzen-3-2200g-geforce-gtx-1660-6gb-galax-oc-8gb-ddr4-hd-1tb-500w-magpie-2";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });
        ImageButton imageButtonpc3 = (ImageButton)findViewById(R.id.pc3);
        imageButtonpc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-amd-athlon-200ge-geforce-gtx-1650-4gb-8gb-ddr4-hd-1tb-400w-magpie-2";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });

        ImageButton imageButtonpc4 = (ImageButton)findViewById(R.id.pc4);
        imageButtonpc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.pichau.com.br/computador-pichau-gamer-i5-8400-geforce-gtx-1660-6gb-galax-oc-8gb-ddr4-hd-1tb-500w-dragoon-r";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);

            }
        });


    }







}
