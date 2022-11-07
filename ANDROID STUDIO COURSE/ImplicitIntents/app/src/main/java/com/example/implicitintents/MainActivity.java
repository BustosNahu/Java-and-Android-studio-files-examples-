package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMap, btnWeb, btnCall, btnCallFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btnCall);
        btnWeb = findViewById(R.id.btnWeb);
        btnMap = findViewById(R.id.btMap);
        btnCallFriend = findViewById(R.id.btnCallFriend);


        /**
         * ACTION_DIAL es una accion a la que se llama, y se utiliza para que la aplicacion
         * se dirija al apartado de llamadas
         */

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });

        /**
         * ACTION_DIAL, Uri.parse("tel:(numero de tel)) se utiliza para ir directamente al apartado
         * y tener el numero ya marcado
         */
        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1167161813"));
                startActivity(intent);

            }
        });


        /**
         * ACTION_VIEW, Uri.parse("geo: SE UTILIZA PARA DIRECCIONAR HACIA UNA LOCALIZACION EN ESPECIFICA
         */
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 0,0?q=1477 cerretti, adrogue, argentina"));
                startActivity(intent);
            }
        });


        /**
         * ACTION_VIEW, Uri.parse("https: SE UTILIZA PARA ABRIR UNA WEB EN ESPECIFICO
         */
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.com/questions/62671106/onactivityresult-method-is-deprecated-what-is-the-alternative"));
            startActivity(intent);
            }
        });






    }
}