package com.fruitsfunki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }



    public void menu(View v) {
        Intent batido1 = new Intent(getApplicationContext(), batido1.class);
        startActivity(batido1);
    }

    public void menu2(View v) {
        Intent batido2 = new Intent(getApplicationContext(), batido2.class);
        startActivity(batido2);
    }
    public void menu3(View v) {
        Intent batido3 = new Intent(getApplicationContext(), eliminar_batidos_normales.class);
        startActivity(batido3);
    }



}
