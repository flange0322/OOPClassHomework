package com.example.cjcu.myapplication;

import java.text.DecimalFormat;

public class ButtonController implements ButtonControllerInterFace{

    private double a_Number;
    private double b_Number;
    private double mSum;
    private ZeroCutter mZC;
    public void setA_number(double number) {
        a_Number = number;
    }

    public void setB_number(double number) {
        b_Number = number;
    }

    public void Button_add(){
        mSum = a_Number + b_Number;
    }

    public void Button_sub(){
        mSum = a_Number - b_Number;
    }

    public void Button_mul(){
        mSum = a_Number * b_Number;
    }

    public void Button_div(){
        mSum = a_Number / b_Number;
    }

    public String getSum(){
        DecimalFormat df = new DecimalFormat("0.00000000");
        String sum = df.format(mSum);
        mZC = new ZeroCutter(sum);
        return sum.substring(0,mZC.ZeroCutter());
    }
}
