package com.avani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void func(View view)
    {
        EditText amount=(EditText)findViewById(R.id.editText2);
        double paise=Double.parseDouble(amount.getText().toString());
        double dollars=paise*0.014;
        Log.i("paise","$"+dollars);
        Toast.makeText(MainActivity.this,"$ "+dollars,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
