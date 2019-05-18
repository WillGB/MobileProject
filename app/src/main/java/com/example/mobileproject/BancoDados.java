package com.example.mobileproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class BancoDados extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_CLIENTE = "bd_clientes";

    private static final String TABELA_CLIENTE = "tb_clientes";
    private static final String COLUNA_LOGIN = "login";
    private static final String COLUNA_SENHA = "senha";
    private static final String COLUNA_ID = "id";

    public BancoDados(Context context) {
        super(context, BANCO_CLIENTE, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COLUNA = "CREATE TABLE " + TABELA_CLIENTE + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY, " + COLUNA_LOGIN + " TEXT,"
                + COLUNA_SENHA + " TEXT)";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*CRUD ABAIXO*/

    void addCliente(Cliente cliente){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_LOGIN, cliente.getLogin());
        values.put(COLUNA_SENHA, cliente.getSenha());

        db.insert(TABELA_CLIENTE, null, values);
        db.close();
    }

    void apagarCliente(Cliente cliente){
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABELA_CLIENTE, COLUNA_ID + " = ?", new String[] {String.valueOf(cliente.getId())});
        db.close();
    }

    Cliente selecionarCliente(String nome){
        SQLiteDatabase db = this.getReadableDatabase();

        Cliente cliente1 = null;

        Cursor cursor = db.query(TABELA_CLIENTE, new String[] {COLUNA_ID, COLUNA_LOGIN, COLUNA_SENHA}, COLUNA_LOGIN + " = ?", new String[]{nome}, null, null, null, null);

        if(cursor != null){
            cursor.moveToFirst();
            cliente1 = new Cliente(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2));
        } else {
            Log.d(null, "plow");
        }


        return cliente1;
    }
}
