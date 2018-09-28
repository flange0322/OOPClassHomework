package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,ViewInterface{

    EditText editText_A;
    EditText editText_B;
    Button add_Btn;
    Button sub_Btn;
    Button mul_Btn;
    Button div_Btn;
    TextView txt_Content_Output;
    Presenter Pt;
    RecyclerView mRecyclerView;
    ArrayList<String> mdata;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        Pt = new Presenter(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(this,mdata));
    }

   public void init(){
        editText_A = findViewById(R.id.editText_A);
        editText_B = findViewById(R.id.editText_B);
        add_Btn = findViewById(R.id.add_Btn);
        sub_Btn = findViewById(R.id.sub_Btn);
        mul_Btn = findViewById(R.id.mul_Btn);
        div_Btn = findViewById(R.id.div_Btn);
        txt_Content_Output = findViewById(R.id.txt_Content_Output);
        mRecyclerView = findViewById(R.id.data_RecyclerView);
        mdata = new ArrayList<>();
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.add_Btn:
                Pt.saveData(getA_word(),getB_word(),getArrayList());
                Pt.Instruction('+');
                Pt.updateData();
                break;
            case R.id.sub_Btn:
                Pt.saveData(getA_word(),getB_word(),getArrayList());
                Pt.Instruction('-');
                Pt.updateData();
                break;
            case R.id.mul_Btn:
                Pt.saveData(getA_word(),getB_word(),getArrayList());
                Pt.Instruction('*');
                Pt.updateData();
                break;
            case R.id.div_Btn:
                Pt.saveData(getA_word(),getB_word(),getArrayList());
                Pt.Instruction('/');
                Pt.updateData();
                break;
            default:
                break;
        }
    }

    public void setSum(String sum){
        txt_Content_Output.setText(sum);
    }

    public void setArrayList(ArrayList<String> mdata) {
        this.mdata = mdata;
    }

    public ArrayList getArrayList(){
        return mdata;
    }

    public double getA_word() {
        if(editText_A.getText().length()>0)
            return new Double(editText_A.getText().toString());
        else{
            Toast.makeText(this,"請輸入數字A",Toast.LENGTH_SHORT).show();
            return 0;
        }
    }

    public double getB_word(){
        if(editText_B.getText().length()>0)
            return new Double(editText_B.getText().toString());
        else{
            Toast.makeText(this,"請輸入數字B",Toast.LENGTH_SHORT).show();
            return 0;
        }
    }
}
