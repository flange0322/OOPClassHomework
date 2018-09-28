package com.example.cjcu.myapplication;

import java.util.ArrayList;

public class Presenter{

    private ButtonController mBC;
    private ViewInterface mView;
    private DataCollector mDC;
    public Presenter(ViewInterface mView){
        mBC = new ButtonController();
        mDC = new DataCollector();
        this.mView = mView;
    }

    public void saveData(double A_number, double B_number, ArrayList<String> mdata){
        mBC.setA_number(A_number);
        mBC.setB_number(B_number);
        mDC.setArrayList(mdata);
    }

    public void Instruction(char way){
        switch (way){
            case '+':
                mBC.Button_add();
                break;
            case '-':
                mBC.Button_sub();
                break;
            case '*':
                mBC.Button_mul();
                break;
            case '/':
                mBC.Button_div();
                break;
            default:
                break;
        }
        mDC.add_Data(mBC.getSum());
    }

    public void updateData(){
        mView.setSum(mBC.getSum());
        mView.setArrayList(mDC.getArrayList());
    }
}
