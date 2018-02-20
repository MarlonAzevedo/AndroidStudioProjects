package series.studio.com.sries;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {
    private ImageView imagem;
    private SeekBar barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = (ImageView) findViewById(R.id.imageViewId);
        barra = (SeekBar) findViewById(R.id.seekBarId);

        barra.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int progresso =(int) progress;
                if(progresso <= 1){
                    imagem.setImageResource(R.drawable.pouco);
                }else if(progresso == 2){
                    imagem.setImageResource(R.drawable.medio);
                }else if(progresso == 3){
                    imagem.setImageResource(R.drawable.muito);
                }else if(progresso == 4){
                    imagem.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
