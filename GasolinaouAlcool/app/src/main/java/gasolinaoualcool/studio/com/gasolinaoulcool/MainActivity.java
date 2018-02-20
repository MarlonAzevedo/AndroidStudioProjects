package gasolinaoualcool.studio.com.gasolinaoulcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoVerifica;
    private TextView resultado;
    private EditText caixaAlcool;
    private EditText caixaGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaAlcool = (EditText) findViewById(R.id.textAlcoolId);
        caixaGasolina = (EditText) findViewById(R.id.textGasolinaId);
        botaoVerifica = (Button) findViewById(R.id.botaoVeificaId);
        resultado = (TextView) findViewById(R.id.textResultId);

        botaoVerifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorAlcool = caixaAlcool.getText().toString();
                String valorGasolina = caixaGasolina.getText().toString();
                Double alcool = Double.parseDouble(valorAlcool);
                Double gasolina = Double.parseDouble(valorGasolina);
                Double result = alcool/gasolina;
                if (valorAlcool.isEmpty()){
                    resultado.setText("Digite o valor do Álcool!!!");
                }else if (valorGasolina.isEmpty()){
                    resultado.setText("Digite o valor da Gasolina!!!");
                }else if (result>=0.7){
                    resultado.setText("É melhor usar Gasolina");
                }else resultado.setText("É melhor usar Álcool");
            }
        });
    }
}
