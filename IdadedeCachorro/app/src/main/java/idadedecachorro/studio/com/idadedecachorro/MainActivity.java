package idadedecachorro.studio.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoCalculaIdade;
    private EditText caixaTexto;
    private TextView textoIdadeHumano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoCalculaIdade = (Button) findViewById(R.id.buttonDescobrirIdade);
        textoIdadeHumano = (TextView) findViewById(R.id.textoIdadeCachorro);

        botaoCalculaIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idade = caixaTexto.getText().toString();
                if(idade.isEmpty()){
                    textoIdadeHumano.setText("Digite a idade");
                 }else {
                    int idadeHumano = Integer.parseInt(idade);
                    int resultado = idadeHumano * 7;
                    textoIdadeHumano.setText("A idade do seu cachorro é: " + resultado + " anos");
                }
            }
        });

    }
}
