package com.example.bank.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Answer extends AppCompatActivity {
    TextView text2;
    public String showanswer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        text2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        showanswer = getIntent().getStringExtra("rate");
        Toast.makeText(this, showanswer, Toast.LENGTH_SHORT).show();
        text2.setText(showanswer);
    }

    public void ReturnMain(View view){
        super.onBackPressed();
    }
}

