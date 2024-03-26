package tavares.soraia.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // A classe MainActivity e a que abre o app

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método onCreate que é chamado quando a atividade é criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Constroi os elementos de interfase
        Button btnEnviar=findViewById(R.id.btnEnviar); // Referencia o botão
        btnEnviar.setOnClickListener(new View.OnClickListener() { // Configura um listener de classe para o botão
            @Override
            public void onClick(View v) { // Método chamado quando o botão é clicado

                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); // referencia o campo de texto pelo id etDigiteAqui
                String textoDigitado = etDigiteAqui.getText().toString(); // Obtemmo texto digitado como dado extra no intent
                Intent i= new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto",textoDigitado); // adiciona o texto digitado
                startActivity(i);

            }
        });
    }
}