package com.example.mobileproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CadastrarUser extends AppCompatActivity {

    TextView viewID;
    EditText txtLogin;
    EditText txtSenha;
    Button btnCadastrar;

    BancoDados bd = new BancoDados(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_user);

        viewID = (TextView) findViewById(R.id.txt_mostra_ID);
        txtLogin = (EditText) findViewById(R.id.txt_cadastra_login);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnCadastrar = (Button) findViewById(R.id.btn_Confirma_Cadastro);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        finish();
    }

    public void cadastraClick(View v) {
        bd.addCliente(new Cliente(txtLogin.getText().toString(), txtSenha.getText().toString()));
        Toast.makeText(getBaseContext(), "Salvo com sucesso", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }
}
