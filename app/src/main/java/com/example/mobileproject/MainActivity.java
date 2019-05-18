package com.example.mobileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtUsuario, txtSenha;
    Button btnLogin, btnCadastra;

    BancoDados bd = new BancoDados(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (TextView) findViewById(R.id.txtUser);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnCadastra = (Button) findViewById(R.id.btnNew);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cliente main = new Cliente(txtUsuario.getText().toString(), txtSenha.getText().toString());
                Cliente base = bd.selecionarCliente(main.getLogin());
                if (main.getLogin().equals(base.getLogin()) && main.getSenha().equals(base.getSenha())){
                    Toast.makeText(MainActivity.this, "sucexo", Toast.LENGTH_LONG).show();
                    setContentView(R.layout.menu);

                } else {
                    Toast.makeText(MainActivity.this, "nononononono", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void cadastrar_user(View v){

        setContentView(R.layout.cadastrar_user);
    }

    public void menu (View v){

        setContentView(R.layout.menu);
    }
}
