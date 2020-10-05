package com.example.cadaluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.orhanobut.hawk.Hawk;

public class LoginActivity extends AppCompatActivity {
    private TextView TextViewNovoCadastro;
    private Button ButtonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Hawk.init(this).build();
        TextViewNovoCadastro = findViewById(R.id.TextViewNovoCadastro);
        ButtonLogin = findViewById(R.id.ButtonLogin);
        if(Hawk.contains("Tem_cadastro")){
            HabilitarLogin();
        }else {
            desabilitarLogin();
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        if(Hawk.contains("Tem_cadastro")){
            HabilitarLogin();
        }else {
            desabilitarLogin();
        }
    }

    private void desabilitarLogin(){
        TextViewNovoCadastro.setVisibility(View.VISIBLE);
        ButtonLogin.setEnabled(false);
        ButtonLogin.setTextColor(getColor(R.color.Gray));
    }
    private void HabilitarLogin(){
        TextViewNovoCadastro.setVisibility(View.GONE);
        ButtonLogin.setTextColor(getColor(R.color.White));
    }


    public void NovoCadastro(View view) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}