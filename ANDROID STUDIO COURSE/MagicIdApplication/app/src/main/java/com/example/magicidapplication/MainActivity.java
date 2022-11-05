package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number_input;
    Button bt_main;
    TextView tx_description;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        number_input = findViewById(R.id.number_input);
        bt_main = findViewById(R.id.bt_main);
        tx_description = findViewById(R.id.tx_description);
        tx_description.setText("Bienvenido");

        bt_main.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String numero =  number_input.getText().toString().trim();
                int numeroTotal = numero.length();
                if (numeroTotal != 13)
                {
                    tx_description.setText("Cantidad de datos 13 (digitos)");
                    return;
                }


                String nacimiento = numero.substring(0, 6);
                int genero = Integer.parseInt(Character.toString(numero.charAt(6)));
                String generoD;
                int nacionalidad  = Integer.parseInt(Character.toString(numero.charAt(10)));
                String nacionalidadD;





                if (genero < 5)
                    generoD = "Mujer";
                else
                    generoD = "Hombre";


                if (nacionalidad == 0 )
                    nacionalidadD = "Buenos Aires";
                else
                    nacionalidadD = "Residente permanente";

                String text = (getString(R.string.dateofbirth) + nacimiento + "\n" +
                        getString(R.string.genero) + generoD + "\n"  +
                        getString(R.string.nacionalidad) + nacionalidadD);

                tx_description.setText(text);




            }
        });
    }
}