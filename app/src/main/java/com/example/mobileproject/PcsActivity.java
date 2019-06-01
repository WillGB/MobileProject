package com.example.mobileproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PcsActivity extends AppCompatActivity {

    private Button btnComprar;
    private ImageButton btnMouse;
    private ImageButton btnTeclado;
    private ImageButton btnCpu;
    private ImageButton btnMonitor;
    private ImageButton btnPlacaMae;
    private ImageButton btnPlacaVideo;
    private ImageButton btnHD;
    private ImageButton btnFonte;
    private ImageButton btnMemoria;
    private TextView textQtde;
    private TextView textTotal;

    private double total = 0.0;
    private int qtde = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monta_pcs);

        btnComprar = (Button) findViewById(R.id.btnComprar);
        btnMouse = (ImageButton) findViewById(R.id.btnMouse);
        btnTeclado = (ImageButton) findViewById(R.id.btnTeclado);
        btnCpu = (ImageButton) findViewById(R.id.btnCpu);
        btnMonitor = (ImageButton) findViewById(R.id.btnMonitor);
        btnPlacaMae = (ImageButton) findViewById(R.id.btnPlacaMae);
        btnFonte = (ImageButton) findViewById(R.id.btnFonte);
        btnPlacaVideo = (ImageButton) findViewById(R.id.btnPlacaVideo);
        btnMemoria = (ImageButton) findViewById(R.id.btnMemoria);
        btnHD = (ImageButton) findViewById(R.id.btnHD);


        textQtde = (TextView) findViewById(R.id.textQtde);
        textTotal = (TextView) findViewById(R.id.textTotal);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.chipart.com.br/monte-seu-computador";
                Intent browser = new Intent(Intent.ACTION_VIEW);
                browser.setData(Uri.parse(url));
                startActivity(browser);
            }
        });

        btnMouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 30.00;
                setTotais();
            }
        });

        btnTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 50.00;
                setTotais();
            }
        });

        btnCpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 500.00;
                setTotais();
            }
        });

        btnMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 1500.00;
                setTotais();
            }
        });

        btnPlacaMae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 750.00;
                setTotais();
            }
        });

        btnHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 250.50;
                setTotais();
            }
        });

        btnPlacaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 2300.50;
                setTotais();
            }
        });

        btnFonte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 850.00;
                setTotais();
            }
        });

        btnMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qtde += 1;
                total += 150.00;
                setTotais();
            }
        });

    }

    private void setTotais()
    {
        textQtde.setText(String.valueOf(qtde));
        textTotal.setText(String.valueOf(total));
    }
}