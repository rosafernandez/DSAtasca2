package edu.upc.eetac.dsa.calculadora2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UI3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui3);
    }

    public void onClickNo (View v){
        //tenco l'intent i passo de una pantalla (UI3) a una altra (UI2)
        finish();
    }

    public void onClickSi (View v){
        //amb l'intent passem de una pantalla (UI3) a una altra (UI1)
        Intent intent1 = new Intent(UI3.this,UI1.class);
        startActivity(intent1);
    }
}
