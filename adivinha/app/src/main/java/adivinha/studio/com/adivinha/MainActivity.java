package adivinha.studio.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;
    private Button limpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        textoResultado = (TextView) findViewById(R.id.resultadoid);
        limpar = (Button) findViewById(R.id.button2) ;

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoResultado.setText("Nenhum Numero");
            }
        });

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(11);
                textoResultado.setText("Numero escolhido: "+num);
            }
        });
    }
}
