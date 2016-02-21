package com.example.ssbt.ex2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText a = (EditText) findViewById(R.id.editText);
        final EditText b = (EditText) findViewById(R.id.editText2);
        Button c = (Button) findViewById(R.id.button);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.getText().toString().equals("android")) {
                    Toast.makeText(getApplicationContext(), "VALID", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(getApplicationContext(), "INVALID", Toast.LENGTH_SHORT).show();
            }
        });
    }

}