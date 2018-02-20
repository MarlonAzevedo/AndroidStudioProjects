package dialog.studio.com.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao =  (Button) findViewById(R.id.buttonId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criar botão de Alerta
                dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar titulo
                dialog.setTitle("Titulo do Dialog");

                //configurar mensagem
                dialog.setMessage("mensagem");

                //para não fechar a dialog
                dialog.setCancelable(false);

                //definindo um icone do proprio android
                dialog.setIcon(android.R.drawable.ic_delete);

                //configurar o botao negativo(NÂO)
                dialog.setNegativeButton(
                        "Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Precionado botão Não", Toast.LENGTH_SHORT).show();
                            }
                        });

                // configurar botão positivo(Sim)
                dialog.setPositiveButton(
                        "Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"precionado botão Sim",Toast.LENGTH_SHORT).show();
                            }
                        });

                //criando o dialog
                dialog.create();

                //motrando o dialog
                dialog.show();


            }
        });
    }
}
