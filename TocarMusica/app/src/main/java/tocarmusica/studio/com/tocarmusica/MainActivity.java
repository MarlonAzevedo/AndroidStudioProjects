package tocarmusica.studio.com.tocarmusica;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;
    private MediaPlayer player;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.buttonTocarId);
        player= MediaPlayer.create(MainActivity.this,R.raw.musica);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(player.isPlaying()){
                    pausarMusica();
                }else {tocarMusica();}

            }
        });
    }

    private void tocarMusica(){
        if(player != null){
            player.start();
            botao.setText("Pausar");
        }
    }
    private void pausarMusica(){
        if (player != null){
            player.pause();
            botao.setText("Tocar");
        }
    }

    //para que quando o player de musica entre en stand buy ele seja destruido pra liberar os recursos da maquina
    @Override
    protected void onDestroy() {
        if(player != null && player.isPlaying()){
            player.stop();
            player.release();
            player=null;
        }
        super.onDestroy();
    }
}
