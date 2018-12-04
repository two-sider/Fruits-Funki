package com.fruitsfunki;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class batido1 extends AppCompatActivity {

    private EditText et_nombre, et_descripcion, et_ingredientes, et_precio;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batido1);

    et_nombre = findViewById(R.id.txt_nombre);
    et_descripcion = findViewById(R.id.txt_descripcion);
    et_ingredientes = findViewById(R.id.txt_ingredientes);
    et_precio = findViewById(R.id.txt_precio);

    }



    public void insertar_batido_normal(View view){

    String nombre = et_nombre.getText().toString();
    String descripcion = et_descripcion.getText().toString();
    String ingredientes = et_ingredientes.getText().toString();
    int precio = Integer.parseInt(et_precio.getText().toString());


        // Crear uno nuevo con los datos que vienen de la pagina
        Map<String, Object> user = new HashMap<>();
        user.put("Nombre_batido", nombre);
        user.put("Descripcion", descripcion);
        user.put("Ingredientes", ingredientes);
        user.put("Precio", precio);


// Add a new document with a generated ID
        db.collection("BatidosNormales")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d("mensaje", "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("mensaje", "Error adding document", e);
                    }
                });



    }











}



