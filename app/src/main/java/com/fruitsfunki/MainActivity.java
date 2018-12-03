package com.fruitsfunki;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

    


public class MainActivity extends AppCompatActivity {

    FloatingActionButton btn_ingresar;

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton btn_ingresar = findViewById(R.id.btn_ingresar);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent menu = new Intent(getApplicationContext(), menu.class);
                startActivity(menu);

            }
        });







}


    public void menu(View v) {



        Intent menu = new Intent(getApplicationContext(), menu.class);
        startActivity(menu);



    }



}
