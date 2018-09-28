package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText_A;
    EditText editText_B;
    Button add_Btn;
    Button sub_Btn;
    Button mul_Btn;
    Button div_Btn;
    TextView txt_Content_Output;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    public void init(){
        editText_A = findViewById(R.id.editText_A);
        editText_B = findViewById(R.id.editText_B);
        add_Btn = findViewById(R.id.add_Btn);
        sub_Btn = findViewById(R.id.sub_Btn);
        mul_Btn = findViewById(R.id.mul_Btn);
        div_Btn = findViewById(R.id.div_Btn);
        txt_Content_Output = findViewById(R.id.txt_Content_Output);
    }
}
