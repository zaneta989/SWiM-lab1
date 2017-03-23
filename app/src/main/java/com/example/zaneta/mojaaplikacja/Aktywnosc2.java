package com.example.zaneta.mojaaplikacja;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Aktywnosc2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc2);
        View mojeOkno2 = findViewById(R.id.mojeOkno2);
        mojeOkno2.setOnLongClickListener(new View.OnLongClickListener()
        { public boolean onLongClick(View v)
            {
                        finish();
                        return false;
            }
        } );
    }
}
