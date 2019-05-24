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

    public final BancoDados bd = new BancoDados(getBaseContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (TextView) findViewById(R.id.txtUser);
        txtSenha = (TextView) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnEntrar);
        btnCadastra = (Button) findViewById(R.id.btnNew);
    }

    public void cadastrar_user(View v){

        final Intent cadastraUserIntent = new  Intent(getBaseContext(), CadastrarUser.class);
        startActivity(cadastraUserIntent);
    }

    public void login(View v)
    {
        //Cliente main = new Cliente(txtUsuario.getText().toString(), txtSenha.getText().toString());
        //Cliente base = bd.selecionarCliente(main.getLogin());
        //if(base != null)
        //{
            //if (main.getLogin().equalsIgnoreCase(base.getLogin()) && main.getSenha().equalsIgnoreCase(base.getSenha())){
                //Toast.makeText(this, "sucexo", Toast.LENGTH_LONG).show();

                final Intent menuIntent = new Intent(getBaseContext(), Menu.class);
                startActivity(menuIntent);
           // }
        //}
        //else {
            //Toast.makeText(this, "nononononono", Toast.LENGTH_LONG).show();
        //}
    }
}
