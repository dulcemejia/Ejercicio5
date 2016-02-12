package com.example.upam.ejercicio5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText,editText2;
    private TextView textView4;
    private CheckBox checkBox, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        textView4=(TextView) findViewById(R.id.textView4);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void operar(View v){
        String valor1=editText.getText().toString();
        String valor2=editText2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String resu=" ";
        if(checkBox.isChecked()==true){
            int suma=nro1+nro2;
            resu="la suma es: "+suma;
        }else
        if(checkBox2.isChecked()==true){
            int resta=nro1-nro2;
            resu=resu+"la resta es: "+resta;
        }
        textView4.setText(resu);
    }
}
