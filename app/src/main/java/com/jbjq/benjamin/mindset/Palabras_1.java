package com.jbjq.benjamin.mindset;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class Palabras_1 extends Activity {

    Button iniciar,palabra1,palabra2,palabra3,palabra4;
    TextView texto1,texto2,texto3;
    Chronometer crono;
    long Time =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabras_1);

        crono = (Chronometer)findViewById(R.id.chronometer);
        iniciar = (Button)findViewById(R.id.button23);


        palabra1 = (Button)findViewById(R.id.button13);
        palabra2 = (Button)findViewById(R.id.button14);
        palabra3 = (Button)findViewById(R.id.button15);
        palabra4 = (Button)findViewById(R.id.button16);

        texto1 = (TextView)findViewById(R.id.textView);
        texto2 = (TextView)findViewById(R.id.textView2);
        texto3 = (TextView)findViewById(R.id.textView3);

        iniciar.setEnabled(true);
        iniciar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                crono.setBase(SystemClock.elapsedRealtime());
                crono.start();
                crono.setVisibility(View.VISIBLE);
                iniciar.setVisibility(View.INVISIBLE);

                texto1.setVisibility(View.VISIBLE);
                texto2.setVisibility(View.VISIBLE);
                texto3.setVisibility(View.VISIBLE);

                palabra1.setVisibility(View.VISIBLE);
                palabra2.setVisibility(View.VISIBLE);
                palabra3.setVisibility(View.VISIBLE);
                palabra4.setVisibility(View.VISIBLE);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_palabras_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
