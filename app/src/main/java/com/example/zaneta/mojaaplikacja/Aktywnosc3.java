package com.example.zaneta.mojaaplikacja;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Aktywnosc3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc3);
    }
    public void powrotDo1(View view) { onBackPressed();
    }
    protected void onStop() { super.onStop();
        Toast.makeText(getApplicationContext(), "Aktywność 3 - Zatrzymana", Toast.LENGTH_SHORT).show();
    }
}
