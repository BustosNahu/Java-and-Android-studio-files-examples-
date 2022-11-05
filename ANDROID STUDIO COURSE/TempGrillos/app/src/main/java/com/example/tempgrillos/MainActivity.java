package com.example.tempgrillos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_calculate;
    EditText editT_num;
    TextView tx_temperatura;
    TextView tx_advertencia;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calculate = findViewById(R.id.btn_calculate);
        editT_num = findViewById(R.id.editT_num);
        tx_temperatura = findViewById(R.id.tx_temperatura);
        tx_advertencia = findViewById(R.id.tx_advertencia);

        tx_advertencia.setVisibility(View.GONE);


        btn_calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String chirridos_input = editT_num.getText().toString().trim();
                int cant_chirridos = Integer.parseInt(chirridos_input);
                int celsius;


                if(cant_chirridos <= 0)
                {
                    tx_advertencia.setText("Ingrese un valor correcto");
                }
                else
                {
                    celsius = (cant_chirridos / 3) + 4;
                    tx_temperatura.setText(String.valueOf(celsius + "°"));
                }


            }
        });

    }
}