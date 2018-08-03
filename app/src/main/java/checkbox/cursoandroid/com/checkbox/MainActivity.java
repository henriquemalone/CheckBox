package checkbox.cursoandroid.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxCachorro;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private Button mostrar;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCachorro = (CheckBox) findViewById(R.id.checkBoxCachorroId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);

        mostrar = (Button) findViewById(R.id.botaoMostrarId);
        texto = (TextView) findViewById(R.id.textoId);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itensSelecionado = "";

                itensSelecionado += "Item: " + checkBoxCachorro.getText() + " Status: " + checkBoxCachorro.isChecked() + "\n";
                itensSelecionado += "Item: " + checkBoxGato.getText() + " Status: " + checkBoxGato.isChecked() + "\n";
                itensSelecionado += "Item: " + checkBoxPapagaio.getText() + " Status: " + checkBoxPapagaio.isChecked() + "\n";

                texto.setText(itensSelecionado);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
