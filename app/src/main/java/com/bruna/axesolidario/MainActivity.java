package com.bruna.axesolidario;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lógica para a barra de progresso do Caboclo Taperoá
        ProgressBar barra = findViewById(R.id.progressCestas);
        if (barra != null) {
            barra.setProgress(60); // 60% das cestas já arrecadadas
        }

        // Mensagem de boas-vindas
        Toast.makeText(this, "Axé! Bem-vindo ao app do Caboclo Taperoá", Toast.LENGTH_LONG).show();
    }
}
