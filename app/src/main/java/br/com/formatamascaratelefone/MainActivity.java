package br.com.formatamascaratelefone;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextDDDeTelefone;
    private EditText editTextDDD;
    private EditText editTextTelefone;
    private EditText editTextDDDeCelular;
    private EditText editTextDDDeTelefoneInternacional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextDDDeTelefone = findViewById(R.id.editTextDDDeTelefone);
        editTextDDD = findViewById(R.id.editTextDDD);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextDDDeCelular = findViewById(R.id.editTextDDDeCelular);
        editTextDDDeTelefoneInternacional = findViewById(R.id.editTextDDDeTelefoneInternacional);

        editTextDDDeTelefone.addTextChangedListener(Mask.insert("(##)####-####", editTextDDDeTelefone));
        editTextDDD.addTextChangedListener(Mask.insert("(##)", editTextDDD));
        editTextTelefone.addTextChangedListener(Mask.insert("####-####", editTextTelefone));
        editTextDDDeCelular.addTextChangedListener(Mask.insert("(##)#####-####", editTextDDDeCelular));
        editTextDDDeTelefoneInternacional.addTextChangedListener(Mask.insert("+##(##)####-####", editTextDDDeTelefoneInternacional));
    }
}
