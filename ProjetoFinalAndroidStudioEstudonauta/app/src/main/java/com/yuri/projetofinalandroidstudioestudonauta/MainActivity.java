package com.yuri.projetofinalandroidstudioestudonauta;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yuri.projetofinalandroidstudioestudonauta.Fragments.HomeFragment;
import com.yuri.projetofinalandroidstudioestudonauta.Helpers.AndroidHelper;

public class MainActivity extends AppCompatActivity {

    private TextView eventos, mensagens, perfil;
    private HomeFragment homeFragment = new HomeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pegarViewsPeloId();
        funcionarBTN();

    }

    public void funcionarBTN(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.FL, homeFragment).commit();

        Typeface customFontMedium = ResourcesCompat.getFont(this, R.font.montserrat_medium);
        Typeface customFontBold = ResourcesCompat.getFont(this, R.font.montserrat_bold);


        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.FL, homeFragment).commit();
                Toast.makeText(MainActivity.this, "HOME", Toast.LENGTH_SHORT).show();

                mensagens.setTypeface(customFontMedium);
                perfil.setTypeface(customFontMedium);
                eventos.setTypeface(customFontBold);
            }
        });

        mensagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "MSG", Toast.LENGTH_SHORT).show();

                eventos.setTypeface(customFontMedium);
                perfil.setTypeface(customFontMedium);
                mensagens.setTypeface(customFontBold);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidHelper.trocarTela(MainActivity.this, PerfilActivity.class    );

                eventos.setTypeface(customFontMedium);
                mensagens.setTypeface(customFontMedium);
                perfil.setTypeface(customFontBold);
            }
        });
    }

    public void pegarViewsPeloId(){
        eventos = findViewById(R.id.eventos);
        mensagens = findViewById(R.id.mensagens);
        perfil = findViewById(R.id.perfil);
    }


}