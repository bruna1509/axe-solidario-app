package com.exemplo.axesolidario;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referência à barra de progresso que criamos no XML
        ProgressBar progressBar = findViewById(R.id.progressBarMeta);
        
        // Futura implementação: Lógica para atualizar o progresso via banco de dados
        progressBar.setProgress(45); 
    }
}
