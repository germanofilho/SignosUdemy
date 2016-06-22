package nixth.com.br.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listView);


        //Array dos signos
        String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião",
                "Sagitário", "Capricórnio", "Aquário", "Peixes"};


        //Array com atributos do signo
        final String[] personalidades =  {"Quando você diz que seu Signo é o Signo de Áries, você certamente diz isso porque no momento do seu nascimento o Sol estava posicionado no Signo de Áries. Ter o sol posicionado em Áries te garante muita energia para se colocar no mundo, por que a energia do ego é muito forte nos Arianos, até por serem normalmente pessoas com uma personalidade forte."
                ,"O Signo de Touro é um signo que tem muita energia para o trabalho, uma vibração muito forte de estabilidade, é um signo que procura segurança, em todos os aspectos da vida, os Taurinos buscam segurança, da relação de trabalho às relações amorosas, e é na segurança que encontramos o desafio de Touro."
                ,"O Signo de Gêmeos já é o oposto do Signo de Touro, por que para os Geminianos falta a estabilidade que Taurinos tem de sobra, o Signo de Gêmeos é um signo muito versátil, mutável, tem uma mente muito ativa, muito inteligente, se comunicam muito bem e muitas vezes por conta disso ficam muito rápidos."
                ,"O Signo de Câncer é um signo muito sensível, intuitivo, que capta as coisas, gostam de ajudar as pessoas, tem a energia da maternidade muito presente e isso faz com que os Cancerianos muitas vezes tenham um lado sensível muito aguçado."
                ,"O Signo de Leão tem uma característica Solar muito forte, o Sol é o regente de Leão. Ter o signo Solar em Leão para a Astrologia é o melhor posicionamento para o signo, os Leoninos de plantão vão amar ler isso!"
                ,"O Signo de Virgem tem uma característica bem específica é um signo muito organizado, muito analítico, focado no discernimento. É um signo que vai estar sempre querendo que as coisas da vida dele estejam organizadas e dentro dos parâmetros do que acha que é correto. São perfeccionistas, então todo o tempo buscam a perfeição."
                ,"O Signo de Libra tem uma característica maravilhosa, a vontade de buscar o equilíbrio, normalmente não gosta de brigas e de ter contenda, busca sempre ver o lado dos outros, é o oposto do Signo de Áries. Enquanto Áries às vezes vê as coisas sobre a perspectiva dele somente, o Libriano não, por que sempre busca ver o lado do outro, faz bem à “política da boa vizinhança”."
                ,"O Signo de Escorpião é um signo muito injustiçado do Zodíaco, falei que Áries também é um signo muito julgado. Porque Escorpião tem a fama de ser traidor, e isso é um estereótipo errado, por que não basta à pessoa ser do Signo de Escorpião que se torna um traidor, existem diversas características no Mapa Astral para analisar e chegar a essa conclusão."
                ,"O Signo de Sagitário é um signo muito jovial, tem muita vitalidade, gosta de viajar, de ser livre e essa é uma característica muito presente neste signo. Imagine a brincadeira de tiro ao alvo, quem acerta o alvo é o Sagitariano, sempre é o “caçador”, nunca a caça."
                ,"O Signo de Capricórnio tem uma questão muito forte com a responsabilidade, tenta ser muito certinho, muitas vezes não consegue ser tão responsável quanto gostaria, vejo muitos Capricornianos na prática que tem problemas com horários, combinam as coisas e não conseguem cumprir e ficam frustrados com isso."
                ,"O Signo de Aquário têm fome de liberdade e muita vontade de serem pessoas diferentes, o Aquariano tem um verdadeiro pavor de ser igual a todo mundo, ser medíocre, ele quer sempre ser diferente."
                ,"O Signo de Peixes têm a característica fortíssima de ser o último signo do Zodíaco, tem o lado espiritual bem destacado, Peixes é o signo da completude, da espiritualidade focada no outro, ou seja, da caridade de como eu estou aqui? Como eu vou colaborar com o mundo? O que eu vou fazer para que o mundo seja melhor?"
        };



        //Adapter default com simple_list
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );


        lv.setAdapter(adapter);


        //Exibir personalidades com Toast Long
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), personalidades[position], Toast.LENGTH_LONG).show();
            }
        });


    }
}
