package checkbox.studio.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {
    private CheckBox checkBoxCachorro;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;
    private Button botao;
    private TextView textomostrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCachorro = (CheckBox) findViewById(R.id.checkBoxCaoId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio =(CheckBox) findViewById(R.id.checkBoxPapagaioId);
        botao = (Button) findViewById(R.id.botaoId);
        textomostrado = (TextView) findViewById(R.id.textoMostradoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionados="";
                // o sinal de + antes do = significa que concatenarei as strings
                itensSelecionados ="Item: " + checkBoxCachorro.getText() + "Status: "+ checkBoxCachorro.isChecked() + "\n";
                itensSelecionados +="Item: " + checkBoxGato.getText() + "Status: "+ checkBoxGato.isChecked() + "\n";
                itensSelecionados +="Item: " + checkBoxPapagaio.getText() + "Status: "+ checkBoxCachorro.isChecked() ;

                textomostrado.setText(itensSelecionados);


            }
        });

    }
}
