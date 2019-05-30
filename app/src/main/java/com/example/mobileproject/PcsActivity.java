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

        textQtde = (TextView) findViewById(R.id.textQtde);
        textTotal = (TextView) findViewById(R.id.textTotal);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.kabum.com.br";
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
    }

    private void setTotais()
    {
        textQtde.setText(String.valueOf(qtde));
        textTotal.setText(String.valueOf(total));
    }
}