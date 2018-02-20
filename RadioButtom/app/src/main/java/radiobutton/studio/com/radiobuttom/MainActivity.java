package radiobutton.studio.com.radiobuttom;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    private RadioGroup grupo;
    private RadioButton botaoEcolhido;
    private Button escolher;
    private TextView escolha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup) findViewById(R.id.radioGroupId);
        escolher = (Button) findViewById(R.id.buttonId);
        escolha = (TextView) findViewById(R.id.textViewId);

        escolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = grupo.getCheckedRadioButtonId();
                if(idRadioButtonEscolhido > 0){
                    botaoEcolhido = (RadioButton) findViewById(idRadioButtonEscolhido);
                    escolha.setText(botaoEcolhido.getText());
                }
            }
        });

    }
}
