package com.example.wirelessproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){

        int tempF = Integer.parseInt(((EditText)findViewById(R.id.degreesF)).getText().toString());
        int tempC = (tempF - 32) * 5/9;

        ((EditText)findViewById(R.id.degreesC)).setText(Integer.toString(tempC));

        return;
    }
}
