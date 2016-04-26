package com.herovitamin.ciclodevida;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Saludos desde onCreate()");

        if(savedInstanceState != null){
            String name = savedInstanceState.getString("STRING");
            Log.i(TAG, "Nombre recuperado: " + name);
        }
        else{
            Log.e(TAG, "El objeto savedInstanceState es nulo");
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Saludos desde onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy en onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Me han pausado!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy detenido");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Fui destruido");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Me reiniciaron :)");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("STRING", "Kerry T. Perez");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null){
            String name = savedInstanceState.getString("STRING");
            Log.i(TAG, "onRestoreInstanceState: Nombre recuperado: " + name);
        }
        else{
            Log.e(TAG, "onRestoreInstanceState: El objeto savedInstanceState es nulo");
        }
    }
}
