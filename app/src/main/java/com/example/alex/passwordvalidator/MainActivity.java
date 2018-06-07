package com.example.alex.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Validator v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = new Validator();
    }
    public void checkPassword(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        String password = editText.getText().toString();
        v.setPassword(password);
        TextView textView = findViewById(R.id.textView);
        textView.setText(v.describeStrength());


    }
}
