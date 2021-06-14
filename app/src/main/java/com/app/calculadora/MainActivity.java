package com.app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> StringVal1;
    private ArrayList<String> StringVal2;
    private ArrayList<Integer> Val1;
    private ArrayList<Integer> Val2;
    private TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.tv_userInput);
        StringVal1 = new ArrayList<>();
        StringVal2 = new ArrayList<>();

        Val1 = new ArrayList<>();
        Val2 = new ArrayList<>();
    }

    public void seven(View view) {
        Val1.add(7);
        StringVal1.add("7");
        StringBuilder sb = new StringBuilder();
        for (String s : StringVal1)
        {
            sb.append(s);
            sb.append("\t");
        }
        input.setText(sb.toString());
    }

    public void Eight(View view) {

    }

    public void Add(View view) {
    }

    public void Equal(View view) {
    }
}