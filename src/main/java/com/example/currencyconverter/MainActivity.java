package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        Log.i("Info", "Button pressed");

        EditText myText = (EditText) findViewById(R.id.amountEditText);

        double d = Double.parseDouble(myText.getText().toString());

        double ans = d * 1.42;

        Toast.makeText(this, "£" + myText.getText().toString() + " is $" + String.format("%.2f", ans), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}