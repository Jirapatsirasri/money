package com.example.bank.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text;
    RadioButton usbutton, jpbutton;
    Button btn,btn2;
    float rate = 0;
    final float usrate = 40;
    final float jprate = 30;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText);
        usbutton = (RadioButton) findViewById(R.id.radioButton);
        jpbutton = (RadioButton) findViewById(R.id.radioButton2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (usbutton.isChecked()) {
            float input = Float.parseFloat(text.getText().toString());
            rate = input * usrate;
            text.setText(String.valueOf(rate));
        }
        if (jpbutton.isChecked()) {
            float input = Float.parseFloat(text.getText().toString());
            rate = input * jprate;
            text.setText(String.valueOf(rate));
        }
        switch (v.getId()) {
            case R.id.button:
                text.setText(String.valueOf(rate));
                break;
            case R.id.button2:
                String s = Float.toString(rate);
                Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,Answer.class);
                i.putExtra("rate",s);
                startActivity(i);
                break;
        }
    }
}
