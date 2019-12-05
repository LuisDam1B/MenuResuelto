package com.example.menuresuelto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean esVisible = false;
    Button mostrarOcultar_Buttom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarOcultar_Buttom = findViewById(R.id.bottomMostrarOcultar);
        mostrarOcultar_Buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (esVisible) esVisible=false;
                else esVisible=true;
            }
        });
    }

    //Lógica del Menu de taskBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);

        if(esVisible){
            menu.setGroupVisible(R.id.grupo1,false);
        }else menu.setGroupVisible(R.id.grupo1,true);

        return true;
    }
}
