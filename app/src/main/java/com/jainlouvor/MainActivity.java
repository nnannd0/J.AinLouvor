package com.jainlouvor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.sobre) {
            Toast.makeText(getApplicationContext(), "Criado por LFox",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.curtir) {
            Toast.makeText(getApplicationContext(), "@Facebook/novaeuropaiasd",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.compartilhar) {
            Snackbar.make(this.findViewById(android.R.id.content), "Em Breve",
                    Snackbar.LENGTH_LONG).setAction("Action", null).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Botão Abrir Layout - Letra (Adoradores - Ao olhar pra cruz)
    public void letra01 (View view) {
        setContentView(R.layout.letra01_aopc);
    }
    public void letra02 (View view) { setContentView(R.layout.letra02_ema);  }

    // Botão Voltar
    public void voltar (View view) {
        setContentView(R.layout.activity_main);}
}
