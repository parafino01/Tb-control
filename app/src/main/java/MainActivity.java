package com.tb.offline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button meuBotao = findViewById(R.id.botao);
        final EditText meuCampo = findViewById(R.id.campoTexto);

        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = meuCampo.getText().toString();
                // Exibe uma mensagem na tela (funciona 100% offline)
                Toast.makeText(MainActivity.this, "Você digitou: " + texto, Toast.LENGTH_LONG).show();
            }
        });
    }
}
