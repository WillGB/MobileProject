package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CadastrarUser extends AppCompatActivity {

    EditText edtNome,edtSenha,edtConfirmarSenha;
    Button btnCadastrar,btnCancelar;

    DBHelperCadastro db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_user);

        db = new DBHelperCadastro(this);

        edtNome=(EditText) findViewById(R.id.txt_cadastra_login);
        edtSenha =(EditText) findViewById(R.id.txtSenha);

        btnCadastrar = (Button) findViewById(R.id.btn_Confirma_Cadastro);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtNome.getText().toString();
                String senha = edtSenha.getText().toString();

                if (username.equals("")) {
                    Toast.makeText(CadastrarUser.this, "Nome não inserido, tente novamente", Toast.LENGTH_SHORT).show();

                } else if (senha.equals("")) {
                    Toast.makeText(CadastrarUser.this, "Senha vazia, tente novamente", Toast.LENGTH_SHORT).show();
                } else {
                    long res = db.CriarUtilizador(username, senha);
                    if (res > 0) {
                        Toast.makeText(CadastrarUser.this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(CadastrarUser.this, MainActivity.class));
                    } else {
                        Toast.makeText(CadastrarUser.this, "Cadastro invalido tente novamente", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}