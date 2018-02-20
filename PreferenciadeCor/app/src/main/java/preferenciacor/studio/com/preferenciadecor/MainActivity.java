package preferenciacor.studio.com.preferenciadecor;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button salvar;
    private RadioGroup cores;
    private RadioButton radioButtonSelecionado;
    private RelativeLayout fundo;

    private static final String ARQUIVO_PREFERENCIAS = "ArqPreferencia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salvar = (Button) findViewById(R.id.buttonId);
        cores = (RadioGroup) findViewById(R.id.radioGroupId);
        fundo = (RelativeLayout) findViewById(R.id.fundoId);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int idRadioButtonEscolhido = cores.getCheckedRadioButtonId();
                radioButtonSelecionado = (RadioButton) findViewById(idRadioButtonEscolhido);

                SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS,0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String corEscolhida = radioButtonSelecionado.getText().toString();
                editor.putString("corEscolhida",corEscolhida);
                editor.commit();

                setBackground(corEscolhida);

            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIAS,0);
        if (sharedPreferences.contains("corEscolhida")){
            String corRecuperada = sharedPreferences.getString("corEscolhida","Laranja");
            setBackground(corRecuperada);
        }
    }

    private void setBackground(String cor){
        if (cor.equals("Azul")){
            fundo.setBackgroundColor(Color.parseColor("#ff0099cc"));
        }else if (cor.equals("Laranja")){
            fundo.setBackgroundColor(Color.parseColor("#ffff8800"));
        }else if (cor.equals("Verde")){
            fundo.setBackgroundColor(Color.parseColor("#ff99cc00"));
        }
    }
}
