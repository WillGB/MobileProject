package com.example.mobileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtUsuario;
    TextView txtSenha;
    Button btnLogin;
    Button btnCadastra;

    DBHelperCadastro db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHelperCadastro(this);
        txtUsuario = (TextView) findViewById(R.id.txtUser);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnCadastra = (Button) findViewById(R.id.btnNew);
    }

    public void cadastrar_user(View v){

        final Intent cadastraUserIntent = new  Intent(getBaseContext(), CadastrarUser.class);
        startActivity(cadastraUserIntent);
    }

    public void entrarOnClick(View view){

        String username = txtUsuario.getText().toString();
        String password = txtSenha.getText().toString();

        if(username.equals("")) {
            Toast.makeText(MainActivity.this, "Nome não inserido, tente novamente", Toast.LENGTH_SHORT).show();
        }
        else if(password.equals("")){
            Toast.makeText(MainActivity.this, "Senha não inserida, tente novamente", Toast.LENGTH_SHORT).show();

        }
        else {

            String res = db.ValidarLogin(username,password);
            if(res.equals("OK")){
                startActivity(new Intent(MainActivity.this, Menu.class));

            }
            else{
                Toast.makeText(MainActivity.this, "Login errado, tente novamente", Toast.LENGTH_SHORT).show();

            }

        }

    }
}
