package com.example.kittinan.por;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private EditText edtName;
    private Button C2F;
    private Button F2C;
    private TextView tv3;
    private TextView tv4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        edtName = findViewById(R.id.edtName);
        C2F = findViewById(R.id.C2F);
        F2C = findViewById(R.id.F2C);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
    }

    public void C2F(View view) {
        Double t;
        String result;
        t = Double.parseDouble(edtName.getText().toString());
        t = (t*1.8)+32;
        result = Double.toString(t);
        tv4.setText("Fahrenheit =");
    }
    public void F2C(View view) {
        Double t;
        String result;
        t = Double.parseDouble(edtName.getText().toString());
        t = ((t-32)*0.5556);
        result = Double.toString(t);
        tv3.setText("Celsius =");
    }
}
