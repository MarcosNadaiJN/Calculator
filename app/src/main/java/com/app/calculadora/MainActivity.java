package com.app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> StringVal1;
    private ArrayList<String> StringVal2;

    private Integer Val1;
    private Integer Val2;

    private TextView input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.tv_userInput);
        StringVal1 = new ArrayList<>();
        StringVal2 = new ArrayList<>();

    }

    public void clear(View view) {
        if (StringVal1.size() > 0) {
            StringVal1.remove(StringVal1.size() -1);
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }


    public void Zero(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("0");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void One(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("1");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Two(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("2");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Three(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("3");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Four(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("4");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Five(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("5");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Six(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("6");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void seven(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("7");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }

    }

    public void Eight(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("8");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Nine(View view) {
        if (Functions.DigitsAllowedSize(StringVal1)) {
            StringVal1.add("9");
            input.setText(Functions.concatArrayListToString(StringVal1));
        }
    }

    public void Add(View view) {
        Val1 = Functions.concatArrayListToInteger(StringVal1);
        StringVal1.add("+");
        input.setText(Functions.concatArrayListToString(StringVal1));
    }
}

