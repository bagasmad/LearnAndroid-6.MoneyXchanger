package com.example.ch2finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertFunction(View view)
    {
        Log.i("Info","Button is Pressed");
        EditText currencyText = findViewById(R.id.currencyText);
        double currencyConvert = Double.valueOf(currencyText.getText().toString()).doubleValue();
        currencyConvert = currencyConvert*1.33;
        Log.i("currencyInput",currencyText.getText().toString());
        Log.i("currencyOutput",Double.toString(currencyConvert));
        Toast.makeText(this,"£"+ currencyText.getText().toString()+" is"+"\n$"+currencyConvert,Toast.LENGTH_LONG).show();

    }
}
