package com.example.meufragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnConversas;
    private Button btnContatos;
    private SegundoFragment contatoFragment;
    private PrimeiroFragment conversaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0); //remove a sombra do action bar
        btnContatos = findViewById(R.id.btnContatos);
        btnConversas = findViewById(R.id.btnConversas);

        conversaFragment = new PrimeiroFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame_conteudo, conversaFragment);
        fragmentTransaction.commit();



        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatoFragment = new SegundoFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_conteudo, contatoFragment);
                fragmentTransaction.commit();
            }
        });

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversaFragment = new PrimeiroFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_conteudo, conversaFragment);
                fragmentTransaction.commit();
            }
        });

    }
}