package com.example.layout_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button equals, operation;
    private TextView textView;
    private EditText editText1, editText2;

    private double ans = 0.0;
    private String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equals = findViewById(R.id.equals);
        operation = findViewById(R.id.operation);
        textView = findViewById(R.id.result);
        editText1 = findViewById(R.id.field1);
        editText2 = findViewById(R.id.field2);
        op = "add";
    }

    public void operation(View view) {

        if(op.equals("add")) {
            op = "sub";
            operation.setText("SUB");
        } else if(op.equals("sub")) {
            op = "mul";
            operation.setText("MUL");
        } else if(op.equals("mul")) {
            op = "div";
            operation.setText("DIV");
        } else if(op.equals("div")) {
            op = "add";
            operation.setText("ADD");
        }

    }

    public void displayResult(View view) {

        double a = Double.parseDouble(editText1.getText().toString());
        double b = Double.parseDouble(editText2.getText().toString());

        if(op.equals("add")) {
            ans = a + b;
        } else if(op.equals("mul")) {
            ans = a * b;
        }  else if(op.equals("sub")) {
            ans = a - b;
        }  else if(op.equals("div")) {
            ans = a / b;
        }

        textView.setText(String.valueOf(ans));

    }

}
