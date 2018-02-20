package signos.studio.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView linstaSignos;
    private String[] signos ={"aquario","peixes","aries","touro","gemeos","cancer","leão","virgem","libra","escorpião","sargitario","capricornio"};
    private String[] perfil ={
            "AQUÁRIO- 21/01 a 19/02\n" +
                    "\n" +
                    " Os antigos diziam que Aquário estava cem anos à frente e que, se o mundo fosse povoado só por aquarianos, não haveria guerra! É o signo dos inventores, dos pensadores, dos intelectuais. O verdadeiro aquariano se preocupa mais em pensar do que em comer! Ele sabe que, quando a alma está alimentada, o corpo se fortalece! Ama a liberdade. Não se prende aos bens terrenos. Sabe que aqui nada é nosso e não somos de ninguém!",
            "PEIXES - 20/02 a 20/03\n" +
                    "\n" +
                    " Quando ama, o mais romântico do Zodíaco vai de corpo inteiro. Impressionável, paciente, costuma confiar demais nos outros (por isso, se decepciona). A mulher de Peixes é a esposa que todo homem quer! O lar, o seu mundo. Todo trabalho ligado à saúde e à educação combina com seu temperamento. É chegado às artes, artesanato, música, poesia, pintura. Tem dupla personalidade e, dificilmente, encara, de frente, as dificuldades. Precisa estar rodeado de gente otimista!",
            "ÁRIES - 21/03 a 20/04\n" +
                    "\n" +
                    " Corajoso, inteligente, ele é o comandante! Vai à frente puxando o Zodíaco. Nunca se acomoda. Tem gênio forte, mas não guarda ressentimento. São os arianos que impulsionam as máquinas do progresso (alguns são precipitados, agem sem refletir e se arrependem). Toda profissão que exija coragem e decisão combina com o seu temperamento, inclusive a carreira militar.",
            "TOURO - 21/04 a 20/05\n" +
                    "\n" +
                    " Metódico, não se arrisca com facilidade. Faz tudo para subir na vida, mas, quando consegue, acha que as pessoas o valorizam pelo que possui. É tímido, e, às vezes, esconde a timidez em uma máscara de orgulho. Como o próprio touro, não sabe a força que tem. Alcança sucesso nos trabalhos ligados a terra e seus produtos. Tem aptidões para a medicina e tudo que está ligado à beleza o atrai.",
            "GÊMEOS - 21/05 a 20/06\n" +
                    "\n" +
                    " É o mensageiro, o signo da comunicação! Muitas viagens, mudanças. Pode realizar mais de um casamento e ter filhos gêmeos. O corpo é ágil como sua mente. Começa alguma coisa com o maior entusiasmo e, de repente, perde o interesse. Ama e deixa de amar com a mesma facilidade! É um signo duplo, mas às vezes parece ser uma multidão! Precisa de liberdade assim como do ar que respira.",
            "CÂNCER – 21/06 a 21/07\n" +
                    "\n" +
                    " Câncer simboliza a família, porque é na quarta casa que todos nós somos concebidos. A mulher sonha com vestido de noiva! É regido pela Lua, que lhe dá um temperamento sensível, impressionável. Embora tenha força de vontade, custa muito para ver os sonhos realizados. Dramatiza pequenas coisas. Não esquece o primeiro amor, a primeira professora. Tudo que lembre o passado faz parte de seu mundo. Na lua cheia, sua libido melhora.",
            "LEÃO – 22/07 a 22/08\n" +
                    "\n" +
                    " É dominador, detesta receber ordens. É meio exagerado em tudo, até na hora do amor! Parece orgulhoso, pedante, mas, no fundo, é tímido e apaixonado por tudo que faz. Só progride fazendo o que gosta, tem muita energia. É generoso, chegado à família, mas esconde essas qualidades em uma máscara de dureza. Às vezes, é franco demais. Tem poucos amigos. É sincero, mas desconfiado. Artista nato, ele adora viajar e correr o mundo pelo prazer de sentir-se livre!",
            "VIRGEM - 23/08 a 22/09\n" +
                    "\n" +
                    " É um signo humano. Seus nativos têm todos os nossos defeitos e qualidades. É uma pessoa detalhista, ordeira, desconfiada, que se preocupa demais com a saúde! Alguns reclamam demais, criticam: “Isso pode virar mania!”. Alguns não levam desaforo para casa. Diante de uma obra de arte, em que muitos se extasiam, o nativo de Virgem procura a etiqueta para ver o preço. Prefere ganhar pouco, mas em um emprego seguro.",
            "LIBRA - 23/09 a 22/10\n" +
                    "\n" +
                    " Libra simboliza o equilíbrio. Qualquer trabalho ligado à arte, beleza ou justiça o beneficia. Na casa onde existe um libriano é ele quem ajuda nas despesas. Basta alguém chorar que ele aparece para consolar. É um romântico, apaixonado. Não gosta de trabalhos pesados. As mulheres são alegres e chamam atenção pelo seu charme e bom gosto. Costumam brilhar na sociedade!",
            "ESCORPIÃO – 23/10 a 21/11\n" +
                    "\n" +
                    " É um signo de extremos. Corajoso, inteligente, audacioso e sensual. Ama ou odeia. Não conhece o caminho do meio, do qual nos falam os chineses! Gosta de coisas misteriosas – não por fé, mas por curiosidade. Ama o poder, a autoridade. Desconfia da própria sombra. Permanece sempre na defensiva. Pode fechar um olho, jamais os dois. Pode casar com pessoa viúva ou receber herança.",
            "SAGITÁRIO – 22/11 a 21/12\n" +
                    "\n" +
                    " É um signo duplo, representado por um Centauro, e tem muita energia. Só trabalha em função de um ideal, nunca apenas pela sobrevivência. Para ele, tudo tem que dar prazer! Tem intuição e criatividade. É otimista, autoconfiante, consegue equilíbrio físico, mental e espiritual. Sob suas vibrações nascem juristas, cientistas, religiosos e todos os que têm obrigação de obedecer às leis de Deus e dos homens.",
            "CAPRICÓNIO – 22/12 a 20/01\n" +
                    "\n" +
                    " Saturno lhe dá um temperamento introvertido. É honesto, sincero, discreto e teimoso. Quando toma uma decisão, vai até o fim. Nunca está satisfeito, quer sempre mais. É econômico. É difícil encontrar um capricorniano aos 40, 45 anos que não tenha melhorado de vida. É mais feliz no interior, lidando com a terra e seus produtos. Parece tímido, mas é mestre na hora do amor!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linstaSignos=(ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        linstaSignos.setAdapter(adptador);
        linstaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;

                Toast.makeText(getApplicationContext(),perfil[codigoPosicao],Toast.LENGTH_LONG).show();
            }
        });
    }
}
