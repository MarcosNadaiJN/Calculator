package com.app.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.calculadora.javaluator.*;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> StringInput;

    private TextView input;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.tv_userInput);
        result = (TextView) findViewById(R.id.tv_userResult);

        StringInput = new ArrayList<>();

        StringInput.add("0");

    }

    /* Functional Buttons */

    public void clear(View view) {
        if (StringInput.size() > 0) {
            StringInput.remove(StringInput.size() -1);
            if (StringInput.size() == 0) {
                StringInput.add("0");
            }
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void ClearAll(View view) {
        StringInput.clear();
        StringInput.add("0");
        input.setText(Functions.concatArrayListToString(StringInput));
        result.setText("0");
    }

    public void Equal(View view) {
        Double inputConverted = new DoubleEvaluator().evaluate(Functions.concatArrayListToString(StringInput));
        //System.out.println(new DoubleEvaluator().evaluate(""));
        //Formating Double to 5 Decimal.
        DecimalFormat decimalF = new DecimalFormat("#.#####");
        String formattedOutput = decimalF.format(inputConverted);
        //
        result.setText(formattedOutput);
        StringInput.clear();
        StringInput.add(formattedOutput);
        input.setText(Functions.concatArrayListToString(StringInput));
    }

    public void Add(View view) {
        if (Functions.DuplicatedSimbols(StringInput) == false) {
            StringInput.add("+");
            input.setText(Functions.concatArrayListToString(StringInput));
        } else {
            StringInput.remove(StringInput.get(StringInput.size() -1 ));
            StringInput.add("+");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Minus(View view) {
        if (Functions.DuplicatedSimbols(StringInput) == false) {
            StringInput.add("-");
            input.setText(Functions.concatArrayListToString(StringInput));
        } else {
            StringInput.remove(StringInput.get(StringInput.size() -1 ));
            StringInput.add("-");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Multiply(View view) {
        if (Functions.DuplicatedSimbols(StringInput) == false) {
            StringInput.add("*");
            input.setText(Functions.concatArrayListToString(StringInput));
        } else {
            StringInput.remove(StringInput.get(StringInput.size() -1 ));
            StringInput.add("*");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Divide(View view) {
        if (Functions.DuplicatedSimbols(StringInput) == false) {
            StringInput.add("/");
            input.setText(Functions.concatArrayListToString(StringInput));
        } else {
            StringInput.remove(StringInput.get(StringInput.size() -1 ));
            StringInput.add("/");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }


    /*  Number Buttons */

    public void DoubleZero(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            StringInput.add("00");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Zero(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            StringInput.add("0");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void One(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("1");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Two(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("2");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Three(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("3");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Four(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("4");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Five(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("5");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Six(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("6");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void seven(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("7");
            input.setText(Functions.concatArrayListToString(StringInput));
        }

    }

    public void Eight(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("8");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Nine(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add("9");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }

    public void Dot(View view) {
        if (Functions.DigitsAllowedSize(StringInput)) {
            if (StringInput.get(0) == "0") {
                StringInput.clear();
            }
            StringInput.add(".");
            input.setText(Functions.concatArrayListToString(StringInput));
        }
    }
}

