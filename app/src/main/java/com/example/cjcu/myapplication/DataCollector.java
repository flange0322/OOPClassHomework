package com.example.cjcu.myapplication;

import java.util.ArrayList;

public class DataCollector {

    ArrayList<String>mdata;
    public void setArrayList(ArrayList<String> mdata){
        this.mdata = mdata;
    }

    public void add_Data(String sum){
        mdata.add(sum);
    }

    public ArrayList getArrayList(){
        return mdata;
    }
}
