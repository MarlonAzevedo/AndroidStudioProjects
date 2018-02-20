package frasesdodia.studio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textoNovafrase;
    private Button novaFrase;

    private String[] frases={
            "frase1",
            "frase2",
            "frase3",
            "frase4",
            "frase5",
            "frase6",
            "frase7",
            "frase8",
            "frase9",
            "frase10",
            "frase11"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        textoNovafrase = (TextView) findViewById(R.id.textoNovaFraseId);

        Random randomico= new Random();
        int numeroAleatorio= randomico.nextInt(frases.length);
        textoNovafrase.setText(frases[numeroAleatorio]);

        novaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico= new Random();
                int numeroAleatorio= randomico.nextInt(frases.length);
                textoNovafrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
