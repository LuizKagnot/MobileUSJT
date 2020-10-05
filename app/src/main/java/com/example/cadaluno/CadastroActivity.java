package com.example.cadaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.orhanobut.hawk.Hawk;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Hawk.init(this).build();
    }

    public void Salvar(View view) {
        Hawk.put("Tem_Cadastro", true);
        Intent intent = new Intent(this, LoginActivity.class);
        finish();
    }
}