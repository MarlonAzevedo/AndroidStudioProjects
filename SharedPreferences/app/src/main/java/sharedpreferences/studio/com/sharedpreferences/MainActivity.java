package sharedpreferences.studio.com.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private EditText textodigitado;
    private TextView textoSalvo;

    private static final String ARQUIVO_PREFERENCIA="ArquiviPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.buttonId);
        textodigitado = (EditText) findViewById(R.id.editTextId);
        textoSalvo = (TextView) findViewById(R.id.nomeSalvoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                if(textodigitado.getText() != null){
                    textoSalvo.setText(textodigitado.getText());
                    editor.putString("nome",textodigitado.getText().toString());
                    editor.commit();
                }else {
                    textoSalvo.setText("digite um nome");
                }
            }
        });

        //Recuperando dados salvos
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA,0);
        if (sharedPreferences.contains("nome")){
            String nomeUsuario = sharedPreferences.getString("nome","usuario não definido");
            textoSalvo.setText("Olá " + nomeUsuario);
        }else {
            textoSalvo.setText("");
        }
    }
}
